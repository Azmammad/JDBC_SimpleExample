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

/*        CrudOperation.insertAuthor("Rovshan Abdullayev");
        CrudOperation.insertAuthor("Elxan Elatli");
        CrudOperation.insertAuthor("Orhan Pamuk");*/

/*       CrudOperation.insertBook("Manzaradan Parçalar",2016,3);
        CrudOperation.insertBook("Relslər Üzərinə Uzanmış Adam",2012,1);
        CrudOperation.insertBook("Görünməyən İzlər",2014,2);
        CrudOperation.insertBook("O Gecə",2016,2);
        CrudOperation.insertBook("Bu Şəhərdə Kimsə Yoxdur",2010,1);
        CrudOperation.insertBook("The White Castle",2013,3);
        CrudOperation.insertBook("Kar",2020,3);*/

        //CrudOperation.listAuthor(connection);
        //CrudOperation.listBook(connection);
    }
}
