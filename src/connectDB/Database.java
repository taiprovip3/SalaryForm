package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static Connection getConnection()
    {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=n11_qllsp","sa","sapassword");
            System.out.println("Kết nối với CSDL thành công!");
        } catch (Exception ex) {
            System.out.println("Kết nối với CSDL thất bại!");
            ex.printStackTrace();
        }
        return conn;
    }
}
