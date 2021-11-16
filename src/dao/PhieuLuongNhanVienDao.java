package dao;

import connectDB.Database;
import model.DonXinNghi;
import model.NhanVien;
import model.PhieuLuongNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PhieuLuongNhanVienDao {
    
    public List<PhieuLuongNhanVien> tinhLuongNhanVien(List<NhanVien> lsnv, int thangLuong) throws ParseException, SQLException {
        Connection conn = Database.getConnection();
        Statement stmt = conn.createStatement();
        PreparedStatement prestmt = null;
        
        List<PhieuLuongNhanVien> lsplnv = new ArrayList<>();
        
        SimpleDateFormat mdf = new SimpleDateFormat("dd/MM/yyyy");
        String chonThang = "31/"+thangLuong+"/2021";
        Date dnew = mdf.parse(chonThang);
        
        String sql = "select TOP 1 stt from phieuluongnhanvien order by stt desc";
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        int soThuThuCuoiCung = rs.getInt(1);
        
        for (NhanVien nv : lsnv) {
            soThuThuCuoiCung++;//Có số thứ tự kế tiếp
            
            Date dold = nv.getNgayKhoiCong();
            long diff = dnew.getTime() - dold.getTime();
            long convert = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            String sql2 = "select soNgayXinNghi from donxinnghi where maNhanVien = '"+nv.getMaNhanVien()+"'";
            ResultSet rs2 = stmt.executeQuery(sql2);
            rs.next();
            int soNgayNghi = rs.getInt(1);
            int soNgayCong = (int) (convert - soNgayNghi);//Có số ngày công
            
            double luongThang = 7000000 * 26 / soNgayCong;//(tổng tất cả đã trừ phí phát sinh + ngày nghỉ)
        
            String sql3 = "insert into phieuluongnhanvien values (?,?,?,?,?,?,?,0,0,0,0,0,N'Ngày',10000,CURRENT_TIMESTAMP,?)";
            prestmt = conn.prepareCall(sql3);
            prestmt.setInt(1, soThuThuCuoiCung);
            prestmt.setString(2, "PL"+soThuThuCuoiCung);
            prestmt.setInt(3, thangLuong);
            prestmt.setString(4, nv.getMaNhanVien());
            prestmt.setString(5, nv.getTenNhanVien());
            prestmt.setString(6, nv.getMaPhongBan());
            prestmt.setInt(7, soNgayCong);
            prestmt.setDouble(8, luongThang);
            prestmt.execute();
        }
        
        return lsplnv;
    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        Date d1 = myFormat.parse("14 11 2020");
        Date d2 = new Date();
        long diff = d2.getTime() - d1.getTime();
//        System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        long convert = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
