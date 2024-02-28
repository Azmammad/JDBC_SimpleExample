package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableOperation {
    public static void createTable(Connection connection) throws SQLException {
            PreparedStatement author_stmt = connection.prepareStatement(IQuery.AUTHOR_TABLE);
            PreparedStatement book_stmt = connection.prepareStatement(IQuery.BOOK_TABLE);

            author_stmt.executeUpdate();
            System.out.println("author Table Created");
            book_stmt.executeUpdate();
            System.out.println("book Table Created");
    }
}
