package testNg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {

    static String url = "jdbc:mysql://localhost:3306/TestData";
    static String dbUsername = "root";
    static String dbPassword = "Lohi@2004";

    public static boolean isUserPresent(String username) throws Exception {

        Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(
                "SELECT * FROM users WHERE username='" + username + "'");

        boolean exists = rs.next();  

        con.close();

        return exists;
    }
}
