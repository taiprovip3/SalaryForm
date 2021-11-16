package util;

import connectDB.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class LoadLastBccID {
    public static String getBCCID(Connection conn) throws SQLException{
        conn = Database.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select TOP 1 maBangChamCong from bangchamcong order by stt desc";
            ResultSet rs = stmt.executeQuery(sql);
            boolean next = rs.next();
            if(!next)
                return "rỗng";
            String a = rs.getString(1);
        conn.close();
        return a;
    }
}
