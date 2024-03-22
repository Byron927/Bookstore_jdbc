package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//! This class will be charge of establishing a connection and close the connection with the database.
public class ConfigurationDB {
    public static Connection connection;


    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Connection failed. " + e.getMessage());
            }
        }
    }

    //This is kevin way to connect
    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://bhipyl6qehpabiwyv10h-mysql.services.clever-cloud.com:3306/bhipyl6qehpabiwyv10h";
            String user = "ujermqgdutf7jemx";
            String password = "7gu3GfOXGHagfpcmnsLF";

            connection = (Connection) DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            System.err.println("Error. Driver not found");
        } catch (SQLException e) {
            System.err.println("Connection failed. " + e.getMessage());
        }
        return connection;
    }
}
