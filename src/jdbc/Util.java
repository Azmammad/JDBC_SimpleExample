package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static String  CONNECTION_URL= "jdbc:mysql://localhost/library";
    static String  USERNAME = "root";
    static String  PASSWORD = "password";

    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(Util.CONNECTION_URL,Util.USERNAME,Util.PASSWORD);
    }
}
