//import testJavaProject1.Printable;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
*/
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Printable obj1 = new Printable("This is Nibeer.");
        obj1.show();

        Showable obj2 = new Showable();
        obj2.show();
        obj2.show(" This is From Show!!!");

/*
        String url = "jdbc:mariadb://localhost:3306/testjava"; // Replace with your database name
        String user = "root";
        String password = ""; // Or your set password if you changed it
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection to MariaDB established successfully!");
            // Perform database operations here
        } catch (SQLException e) {
            System.err.println("Error connecting to MariaDB: " + e.getMessage());
        }

    */
/*
         // Database credentials
        String url = "jdbc:mariadb://localhost:3306/testjava"; // Use your database name
        String user = "root"; // XAMPP's default user
        String password = ""; // XAMPP's default root password is empty

        // Connection and statement objects
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection to MariaDB established successfully!");

            // Create a statement
            try (Statement stmt = conn.createStatement()) {

                // Insert a new user
                String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')";
                int rowsAffected = stmt.executeUpdate(insertSQL);
                System.out.println(rowsAffected + " row(s) inserted.");

                // Select all users and print the results
                String selectSQL = "SELECT id, name, email FROM users";
                try (ResultSet rs = stmt.executeQuery(selectSQL)) {
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
        }
*/

        MariaDBConnection cn = new MariaDBConnection();
        String insertSQL = "INSERT INTO users (name, email) VALUES ('Jon Poe', 'jon.poe@example.com')";        
        cn.createStatement(insertSQL);

        String selectSQL = "SELECT id, name, email FROM users";
        cn.selectStatement(selectSQL);

        String deletetSQL = "DELETE FROM users WHERE id = 8";        
        cn.deleteStatement(deletetSQL);

        String updateSQL = "UPDATE users SET name ='Nibeer' WHERE id = 5";        
        cn.updateStatement(updateSQL);

        //String selectSQL = "SELECT id, name, email FROM users";
        cn.selectStatement(selectSQL);


    }
}
