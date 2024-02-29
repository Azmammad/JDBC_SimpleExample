package jdbc;

import java.sql.*;

public class CrudOperation {
public static void insertAuthor(String fullName){
        try(Connection conn = Util.getConnect();
            PreparedStatement stmt = conn.prepareStatement(IQuery.INSERT_AUTHOR)) {
            stmt.setString(1,fullName);
            stmt.executeUpdate();
            System.out.println("rows affected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertBook(String title,int year,int author_id){
        try(Connection conn = Util.getConnect();
            PreparedStatement stmt = conn.prepareStatement(IQuery.INSERT_BOOK)) {
            stmt.setString(1,title);
            stmt.setInt(2,year);
            stmt.setInt(3,author_id);
            stmt.executeUpdate();
            System.out.println("rows affected");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listAuthor(Connection connection) throws SQLException {
        Statement statement  = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(IQuery.SELECT_AUTHOR);
        System.out.println("Authors : ");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        statement.close();
    }

    public static void listBook(Connection connection) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(IQuery.SELECT_BOOK);
        ResultSet resultSet = stmt.executeQuery(IQuery.SELECT_BOOK);
        System.out.println("Book : ");
        while (resultSet.next()){
            System.out.println(resultSet.getString("title") + " by "
                    + resultSet.getString("name"));
        }
        resultSet.close();
        stmt.close();
    }
}
