/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Database;
import model.DonXinNghi;
import model.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
            
            String sql = "select * from donxinnghi order by stt ASC";
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
    
    
    public boolean insert(DonXinNghi donXinNghi) {
        boolean result = true;
        Connection conn = null;
        PreparedStatement statement = null;
        Statement s = null;
        int stt = 1;
        try {
            conn = Database.getConnection();
            String sql = "select max(stt) as stt from donxinnghi";
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                stt = rs.getInt("stt") + 1;
            }
            
            String sql1 = "insert into donxinnghi values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql1);
            statement.setInt(1, stt);
            statement.setString(2, donXinNghi.getMaDonNghi());
            statement.setString(3, donXinNghi.getMaNhanVien());
            statement.setString(4, donXinNghi.getTenNhanVien());
            statement.setBoolean(5, donXinNghi.isLoaiNhanVien());
            statement.setString(6, donXinNghi.getLyDo());
            Date ngayNghi = new Date(donXinNghi.getNgayNghi().getTime());
            statement.setDate(7, ngayNghi);
            statement.setInt(8, donXinNghi.getSoNgayXinNghi());
            statement.setBoolean(9, donXinNghi.isLoaiNghi());
            statement.execute();
        } catch(Exception e) {
            Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, e);
            result = false;
        } finally {
            try {
                conn.close();
                statement.close();
                s.close();
            } catch (SQLException ex) {
                Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    public boolean update(DonXinNghi donXinNghi, int stt) {
        boolean result = true;
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = Database.getConnection();
            
            String sql1 = "update donxinnghi set maDonNghi = ?, maNhanVien = ?, tenNhanVien = ?, loaiNhanVien = ?, lyDo = ?, ngayNghi = ?, soNgayXinNghi = ?, loaiNghi = ? WHERE stt = ?";
            statement = conn.prepareCall(sql1);
            statement.setString(1, donXinNghi.getMaDonNghi());
            statement.setString(2, donXinNghi.getMaNhanVien());
            statement.setString(3, donXinNghi.getTenNhanVien());
            statement.setBoolean(4, donXinNghi.isLoaiNhanVien());
            statement.setString(5, donXinNghi.getLyDo());
            Date ngayNghi = new Date(donXinNghi.getNgayNghi().getTime());
            statement.setDate(6, ngayNghi);
            statement.setInt(7, donXinNghi.getSoNgayXinNghi());
            statement.setBoolean(8, donXinNghi.isLoaiNghi());
            statement.setInt(9, stt);
            statement.execute();
        } catch(Exception e) {
            Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, e);
            result = false;
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    public boolean delete(int stt) {
        boolean result = true;
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = Database.getConnection();
            
            String sql1 = "delete from donxinnghi WHERE stt = ?";
            statement = conn.prepareCall(sql1);
            statement.setInt(1, stt);
            statement.execute();
        } catch(Exception e) {
            Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, e);
            result = false;
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DonXinNghiDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
}
