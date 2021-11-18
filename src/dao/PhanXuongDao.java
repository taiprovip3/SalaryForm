package dao;

import connectDB.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import model.PhanXuong;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class PhanXuongDao {
    private JTextArea log;
    
    public void setLogText(JTextArea textArea) {
        this.log = textArea;
    }
    
    public List<PhanXuong> timKiemPhanXuong(String columns, int limit, String tuKhoa) {
        List<PhanXuong> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Database.getConnection();
            StringBuilder query = new StringBuilder("SELECT ");
            if (limit != 0) {
                query.append("TOP ").append(limit).append(" * ");
            } else {
                query.append("* ");
            }
            query.append("FROM phanxuong WHERE 1=1 ");
            String[] listColumn = columns.split(" ");
            boolean isFirst = true;
            for (String column : listColumn) {
                if (isFirst) {
                    isFirst = false;
                    query.append("AND " + column + " LIKE ? ");
                } else {
                    query.append("OR " + column + " LIKE ? ");
                }
            }
            query.append("ORDER BY stt ASC");
            stmt = conn.prepareCall(query.toString());
            log.setText(query.toString());
            
            int index = 1;
            tuKhoa = tuKhoa.replace("%", "\\%").replace("_", "\\_");
            for (String column : listColumn) {
                stmt.setString(index++, '%' + tuKhoa + '%');
            }
            ResultSet rs = stmt.executeQuery();
            if (rs != null) {
                while(rs.next()) {
                    String maPX = rs.getString("maPhanXuong");
                    String tenPX = rs.getString("tenPhanXuong");
                    String tenNgDaiDien = rs.getString("tenNguoiDaiDien");
                    String maCongDoan = rs.getString("maCongDoan");
                    String viTri = rs.getString("viTri");
                    int soluongCN = rs.getInt("soLuongCongNhan");
                    list.add(new PhanXuong(maPX, tenPX, tenNgDaiDien, maCongDoan, viTri, soluongCN));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(PhanXuongDao.class.getName()).log(Level.SEVERE, null, e);
            log.setText(e.toString());
        } finally {
            try {
                conn.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhanXuongDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
