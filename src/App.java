//import testJavaProject1.Printable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Printable obj1 = new Printable("This is Nibeer.");
        obj1.show();

        Showable obj2 = new Showable();
        obj2.show();
        obj2.show(" This is From Show!!!");


        String url = "jdbc:mariadb://localhost:3306/testjava"; // Replace with your database name
        String user = "root";
        String password = ""; // Or your set password if you changed it
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection to MariaDB established successfully!");
            // Perform database operations here
        } catch (SQLException e) {
            System.err.println("Error connecting to MariaDB: " + e.getMessage());
        }



    }
}
