package jdbc;

public interface IQuery {
    String query = "create database library";

    String AUTHOR_TABLE = "CREATE TABLE IF NOT EXISTS author" +
            "(id INTEGER NOT NULL AUTO_INCREMENT," +
            "name VARCHAR(25) NOT NULL";

    String BOOK_TABLE = "CREATE TABLE IF NOT EXISTS book" +
            "(id INTEGER NOT NULL AUTO_INCREMENT," +
            "title VARCHAR(25) NOT NULL," +
            "year INT NULL," +
            "PRIMARY KEY(id), " +
            "author_id INT, " +
            "FOREIGN KEY (author_id) REFERENCES author(id))";

    String INSERT_AUTHOR = "insert into author(name) values(?)";
    String INSERT_BOOK = "insert into book(title,year,author_id) values(?,?,?)";

    String SELECT_AUTHOR = "select * from author";
    String SELECT_BOOK = "select b.title,a.name from book b join author a on b.author_id = a.id";
}
