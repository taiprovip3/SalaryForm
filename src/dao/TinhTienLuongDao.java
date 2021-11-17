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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BangChamCong;
import model.DanhSachPhieuLuong;

/**
 *
 * @author taiproduaxe
 */
public class TinhTienLuongDao {
    public List<DanhSachPhieuLuong> loadDanhSachPhieuLuong() {
        Connection conn = null;
        Statement stmt = null;
        List<DanhSachPhieuLuong> lspl = new ArrayList<>();
        try {
            conn = Database.getConnection();
            stmt=conn.createStatement();
            String sql = "select * from danhsachphieuluong";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                Timestamp ts = rs.getTimestamp("ngayLuu");
                Date ngayLuu = new Date(ts.getTime());
                DanhSachPhieuLuong pl = new DanhSachPhieuLuong(rs.getString("maPhieuLuong"), rs.getInt("thangLuong"), rs.getBigDecimal("luongDaTra").doubleValue(), ngayLuu, rs.getString("loaiPhieuLuong"));
                lspl.add(pl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lspl;
    }
}
