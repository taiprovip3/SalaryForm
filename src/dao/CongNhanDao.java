/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CongNhan;
import model.NhanVien;

/**
 *
 * @author taiproduaxe
 */
public class CongNhanDao {
    public List<CongNhan> loadDanhSachCongNhanFromDatabase() {
        List<CongNhan> lscn = new ArrayList<>();
        try {
            
            Connection conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            
            String sql = "select * from congnhan";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                int test = rs.getInt("gioiTinh");
                boolean gt = false;
                if(test == 1)
                    gt = true;
                CongNhan cn = new CongNhan(rs.getString("maCongNhan"), rs.getString("tenCongNhan"), rs.getInt("namSinh"), gt, rs.getDate("ngayKhoiCong"), rs.getString("SDT"), rs.getString("maPhanXuong"));
                lscn.add(cn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lscn;
    }
}
