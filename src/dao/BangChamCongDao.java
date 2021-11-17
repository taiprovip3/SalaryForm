package dao;
import connectDB.Database;
import model.BangChamCong;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class BangChamCongDao {
    private JTextArea log;
    
    public void setLogText(JTextArea textArea) {
        this.log = textArea;
    }
    
    private List<BangChamCong> lsBcc;

    public BangChamCongDao() {
        lsBcc = new ArrayList<>();
    }
    public boolean themBangChamCongXuongDatabase(BangChamCong bcc, int stt) throws SQLException
    {
        Connection conn = null;
        PreparedStatement statement = null;
        conn = Database.getConnection();
        String sql = "insert into bangchamcong values (?, ?, ?, ?)";
        statement = conn.prepareCall(sql);
        statement.setInt(1, stt);
        statement.setString(2, bcc.getMaBangChamCong());
        statement.setString(3, bcc.getMaDonVi());
        Date ts = new Date(bcc.getNgayChamCong().getTime());
        statement.setDate(4, ts);
        statement.execute();
        conn.close();
        return true;
    }

    public List<BangChamCong> loadDataToList() {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = Database.getConnection();
            stmt=conn.createStatement();
            String sql = "select * from bangchamcong";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                BangChamCong bcc = new BangChamCong(rs.getString("maBangChamCong"), rs.getString("maDonVi"), rs.getDate("ngayChamCong"));
                lsBcc.add(bcc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangChamCongDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lsBcc;
    }
    
    public boolean suaBangChamCong(String maBCCcu, BangChamCong bccnew) throws SQLException{
        for (BangChamCong bangChamCong : lsBcc) {
            if(bangChamCong!=null)
                if(bangChamCong.getMaBangChamCong().equalsIgnoreCase(bccnew.getMaBangChamCong()))
                    return false;
        }
        Connection conn = null;
        PreparedStatement stmt = null;
        conn = Database.getConnection();
        String sql = "update bangchamcong set maBangChamCong=?,maDonVi=?,ngayChamCong=? where maBangChamCong=?";
        stmt = conn.prepareCall(sql);
        stmt.setString(1, bccnew.getMaBangChamCong());
        stmt.setString(2, bccnew.getMaDonVi());
        Date ts = new Date(bccnew.getNgayChamCong().getTime());
        stmt.setDate(3, ts);
        stmt.setString(4, maBCCcu);
        stmt.execute();
        return true;
    }
    
    public boolean xoaBangChamCongDuoiDatabase(String maBcc) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        conn = Database.getConnection();
        String sql = "delete from bangchamcong where maBangChamCong = ?";
        stmt = conn.prepareCall(sql);
        stmt.setString(1, maBcc);
        stmt.execute();
        return true;
    }
    
    public List<BangChamCong> timKiem(String columns, String tuKhoa, int limit) {
        List<BangChamCong> list = new ArrayList<>();
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
            query.append("FROM bangchamcong WHERE 1=1 ");
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
                    String maBCC = rs.getString("maBangChamCong");
                    Date thoiGian = rs.getDate("ngayChamCong");
                    String maPX = rs.getString("maDonVi");
                    list.add(new BangChamCong(maBCC, maPX, thoiGian));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(BangChamCongDao.class.getName()).log(Level.SEVERE, null, e);
            log.setText(e.toString());
        } finally {
            try {
                conn.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(BangChamCongDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
