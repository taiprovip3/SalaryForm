/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Database;
import model.BangChamCong;
import model.NhanVien;
import java.io.InputStream;
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
public class NhanVienDao {

    public List<NhanVien> loadDanhSachNhanVienFromDatabase() {
        List<NhanVien> lsnv = new ArrayList<>();
        try {
            
            Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            
            String sql = "select * from nhanvien";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                int test = rs.getInt("gioiTinh");
                boolean gt = false;
                if(test == 1)
                    gt = true;
                NhanVien nv = new NhanVien(rs.getString("maNhanVien"), rs.getString("tenNhanVien"), rs.getInt("namSinh"), gt, rs.getDate("ngayKhoiCong"), rs.getString("SDT"), rs.getString("maPhongBan"));
                lsnv.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsnv;
    }

}
