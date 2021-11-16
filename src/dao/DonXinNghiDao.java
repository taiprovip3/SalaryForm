/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Database;
import model.DonXinNghi;
import model.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taiproduaxe
 */
public class DonXinNghiDao {

    public List<DonXinNghi> loadDanhSachDonXinNghiFromDatabase() {
        List<DonXinNghi> lsdn = new ArrayList<>();
        try {
            
            Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            
            String sql = "select * from donxinnghi";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                int test1 = rs.getInt("loaiNhanVien");
                boolean loaiNhanVien = false;
                if(test1 == 1)
                    loaiNhanVien = true;
                int test2 = rs.getInt("loaiNghi");
                boolean loaiNghi = false;
                if(test2 == 1)
                    loaiNghi = true;
                DonXinNghi dxn = new DonXinNghi(rs.getString("maDonNghi"), rs.getString("maNhanVien"), rs.getString("tenNhanVien"), loaiNhanVien, rs.getString("lyDo"), rs.getDate("ngayNghi"), rs.getInt("soNgayXinNghi"), loaiNghi);
                lsdn.add(dxn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsdn;
    }
    
}
