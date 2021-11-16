/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Database;
import model.PhieuLuongCongNhan;
import model.PhieuLuongDonVi;
import model.PhieuLuongNhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taiproduaxe
 */
public class PhieuLuongDao {
    public List<Object> loadDanhSachPhieuLuongFromDatabaseToList(){
        List<Object> lsPL = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = Database.getConnection();
            stmt = conn.createStatement();
            
            String sql1 = "select * from phieuluongdonvi";
            ResultSet rs1 = stmt.executeQuery(sql1);
            while (rs1.next()) {
                Date ngayTraDate1 = new Date(rs1.getTimestamp("ngayTra").getTime());
                PhieuLuongDonVi pldv = new PhieuLuongDonVi(rs1.getString("maPhieuLuong"), rs1.getInt("thangLuong"), rs1.getBoolean("loaiDonVi"), rs1.getString("maDonVi"), rs1.getDouble("luongTra"), rs1.getDouble("phuCap"), rs1.getInt("soLuongNhanVien"), ngayTraDate1, rs1.getDouble("tongTien"));
                lsPL.add(pldv);
            }
            String sql2 = "select * from phieuluongnhanvien";
            ResultSet rs2 = stmt.executeQuery(sql2);
            while (rs2.next()) {
                Date ngayTraDate2 = new Date(rs2.getTimestamp("ngayInPhieuLuong").getTime());
                PhieuLuongNhanVien plnv = new PhieuLuongNhanVien(rs2.getString("maPhieuLuong"), rs2.getInt("thangLuong"), rs2.getString("maNhanVien"), rs2.getString("tenNhanVien"), rs2.getString("phongBan"), rs2.getInt("soNgayCong"), rs2.getInt("soNgayNghiCoPhep"), rs2.getInt("soNgayNghiKhongPhep"), rs2.getInt("soGioTangCa"), rs2.getDouble("tongTienTangCa"), rs2.getDouble("phuCap"), rs2.getString("donViChamCong"), rs2.getDouble("chiPhiPhatSinh"), ngayTraDate2, rs2.getDouble("tongTien"));
                lsPL.add(plnv);
            }
            String sql3 = "select * from phieuluongcongnhan";
            ResultSet rs3 = stmt.executeQuery(sql3);
            while (rs3.next()) {
                Date ngayTraDate3 = new Date(rs3.getTimestamp("ngayInPhieuLuong").getTime());
                PhieuLuongCongNhan plcn = new PhieuLuongCongNhan(rs3.getString("maPhieuLuong"), rs3.getInt("thangLuong"), rs3.getString("maCongNhan"), rs3.getString("hoTen"), rs3.getString("phanXuong"), rs3.getDate("ngayKhoiCong"), rs3.getInt("soNgayCong"), rs3.getInt("soNgayNghiCoPhep"), rs3.getInt("soNgayNghiKhongPhep"), rs3.getInt("tongSoLuongSanPham"), rs3.getDouble("tongTienSanPham"), rs2.getDouble("phuCap"), rs3.getString("donViChamCong"), rs3.getDouble("phiPhatSinh"), ngayTraDate3, rs3.getDouble("tongTien"));
                lsPL.add(plcn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuLuongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsPL;
    }
    public List<PhieuLuongDonVi> loadPhieuLuongDonVi(){
        List<PhieuLuongDonVi> pldv = new ArrayList<>();
            Connection conn = null;
            Statement stmt = null;
            
            try {
                conn = Database.getConnection();
                stmt = conn.createStatement();
                String sql = "select * from phieuluongdonvi";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    Date ngayTraDate = new Date(rs.getTimestamp("ngayTra").getTime());
                    PhieuLuongDonVi o = new PhieuLuongDonVi(rs.getString("maPhieuLuong"), rs.getInt("thangLuong"), rs.getBoolean("loaiDonVi"), rs.getString("maDonVi"), rs.getDouble("luongTra"), rs.getDouble("phuCap"), rs.getInt("soLuongNhanVien"), ngayTraDate, rs.getDouble("tongTien"));
                    pldv.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(PhieuLuongDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return pldv;
    }
    public List<PhieuLuongNhanVien> loadPhieuLuongNhanVien(){
        List<PhieuLuongNhanVien> plnv = new ArrayList<>();
            Connection conn = null;
            Statement stmt = null;
            
            try {
                conn = Database.getConnection();
                stmt = conn.createStatement();
                String sql = "select * from phieuluongnhanvien";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Date ngayTraDate = new Date(rs.getTimestamp("ngayInPhieuLuong").getTime());
                PhieuLuongNhanVien o = new PhieuLuongNhanVien(rs.getString("maPhieuLuong"), rs.getInt("thangLuong"), rs.getString("maNhanVien"), rs.getString("tenNhanVien"), rs.getString("phongBan"), rs.getInt("soNgayCong"), rs.getInt("soNgayNghiCoPhep"), rs.getInt("soNgayNghiKhongPhep"), rs.getInt("soGioTangCa"), rs.getDouble("tongTienTangCa"), rs.getDouble("phuCap"), rs.getString("donViChamCong"), rs.getDouble("chiPhiPhatSinh"), ngayTraDate, rs.getDouble("tongTien"));
                plnv.add(o);
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(PhieuLuongDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return plnv;
    }
    public List<PhieuLuongCongNhan> loadPhieuLuongCongNhan(){
        List<PhieuLuongCongNhan> plcn = new ArrayList<>();
            Connection conn = null;
            Statement stmt = null;
            
            try {
                conn = Database.getConnection();
                stmt = conn.createStatement();
                String sql = "select * from phieuluongcongnhan";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Date ngayTraDate = new Date(rs.getTimestamp("ngayInPhieuLuong").getTime());
                PhieuLuongCongNhan o = new PhieuLuongCongNhan(rs.getString("maPhieuLuong"), rs.getInt("thangLuong"), rs.getString("maCongNhan"), rs.getString("hoTen"), rs.getString("phanXuong"), rs.getDate("ngayKhoiCong"), rs.getInt("soNgayCong"), rs.getInt("soNgayNghiCoPhep"), rs.getInt("soNgayNghiKhongPhep"), rs.getInt("tongSoLuongSanPham"), rs.getDouble("tongTienSanPham"), rs.getDouble("phuCap"), rs.getString("donViChamCong"), rs.getDouble("phiPhatSinh"), ngayTraDate, rs.getDouble("tongTien"));
                plcn.add(o);
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(PhieuLuongDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return plcn;
    }
}
