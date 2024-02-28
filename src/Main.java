import jdbc.CrudOperation;
import jdbc.DbOperation;
import jdbc.TableOperation;
import jdbc.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Util.getConnect();
        //DbOperation.create(connection);

        //TableOperation.createTable(connection);

        //CrudOperation.insertAuthor();
        //CrudOperation.insertBook();

        //CrudOperation.listAuthor(connection);
        //CrudOperation.listBook(connection);
    }
}