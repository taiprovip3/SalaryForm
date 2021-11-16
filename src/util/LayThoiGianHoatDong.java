package util;

import connectDB.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LayThoiGianHoatDong {
    private static Connection conn;
    public static int getTimed(String username) throws SQLException{
        conn = Database.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select thoiGianHoatDong from taikhoan where username = '"+username+"'";
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        int a = rs.getInt(1);
        conn.close();
        return a;
    }
}
