package teamadventure.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    public static Connection createConnection(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres?user=postgres&password=1Q2W3E4R");
            return connection;
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(createConnection());
    }

}
