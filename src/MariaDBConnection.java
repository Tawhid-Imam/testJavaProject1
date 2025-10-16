import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDBConnection {
        // Database credentials
        String url = "jdbc:mariadb://localhost:3306/testjava"; // Use your database name
        String user = "root"; // XAMPP's default user
        String password = ""; // XAMPP's default root password is empty
       // Connection conn;
        /*
        public MariaDBConnection() {
             // Connection and statement objects
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to MariaDB established successfully!");
                this.conn = conn;
            }catch (SQLException e) {
                System.err.println("Database connection failed: " + e.getMessage());
                e.printStackTrace();
            }
        }
        */

        public void createStatement( String query){
        
             // Connection and statement objects
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to MariaDB established successfully!");
               // this.conn = conn;

                // Create a statement
                try (Statement stmt = conn.createStatement()) {

                    // Insert a new user
                   // String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')";
                    String insertSQL = query;
                    int rowsAffected = stmt.executeUpdate(insertSQL);
                    System.out.println(rowsAffected + " row(s) inserted.");
                
                }
            }catch (SQLException e) {
                System.err.println("Database insertion failed: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public void deleteStatement( String query){
        
             // Connection and statement objects
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to MariaDB established successfully!");
           
                // Create a statement
                try (Statement stmt = conn.createStatement()) {

                    // Insert a new user
                   // String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')";
                    String deleteSQL = query;
                    int rowsAffected = stmt.executeUpdate(deleteSQL);
                    System.out.println(rowsAffected + " row(s) deleted.");
                }
            }catch (SQLException e) {
                System.err.println("Database deletion failed: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public void updateStatement( String query){
            // Connection and statement objects
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to MariaDB established successfully!");
           
                // Create a statement
                try (Statement stmt = conn.createStatement()) {

                    // Insert a new user
                   // String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')";
                    String updateSQL = query;
                    int rowsAffected = stmt.executeUpdate(updateSQL);
                    System.out.println(rowsAffected + " row(s) Updated.");
                }
            }catch (SQLException e) {
                System.err.println("Database Modification failed: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public void selectStatement( String query){
            
           // System.out.println("COnnection object: " + conn);
            //Statement stmt1 = this.conn.createStatement();
            System.out.println(" Statement: " );

             try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to MariaDB established successfully!");
             

                // Create a statement
                try (Statement stmt1 = conn.createStatement()) {

                    // Select all users and print the results
                    //String selectSQL = "SELECT id, name, email FROM users";
                   String selectSQL = query;
                    try (ResultSet rs = stmt1.executeQuery(selectSQL)) {
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
                        }
                    }
                
                }
            }catch (SQLException e) {
                System.err.println("Database selection failed: " + e.getMessage());
                e.printStackTrace();
            }
        }
/*
        public Connection getConnection(){
            return this.conn;
        }
 
        public void testConnection() throws Exception{
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
        }
   */  
    
 
}
