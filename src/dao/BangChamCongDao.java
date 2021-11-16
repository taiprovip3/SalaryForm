package dao;
import connectDB.Database;
import model.BangChamCong;
import java.sql.Connection;
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

public class BangChamCongDao {
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
        Timestamp ts = new Timestamp(bcc.getThoiGian().getTime());
        statement.setTimestamp(3, ts);
        statement.setString(4, bcc.getMaPhanXuong());
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
                BangChamCong bcc = new BangChamCong(rs.getString("maBangChamCong"), rs.getTimestamp("thoiGian"), rs.getString("maPhanXuong"));
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
        String sql = "update bangchamcong set maBangChamCong=?,thoiGian=?,maPhanXuong=? where maBangChamCong=?";
        stmt = conn.prepareCall(sql);
        stmt.setString(1, bccnew.getMaBangChamCong());
        Timestamp ts = new Timestamp(bccnew.getThoiGian().getTime());
        stmt.setTimestamp(2, ts);
        stmt.setString(3, bccnew.getMaPhanXuong());
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
}
