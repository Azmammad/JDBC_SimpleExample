package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperation {
    public static void create(Connection connection) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(IQuery.query);
    }
}
