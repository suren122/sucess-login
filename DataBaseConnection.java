package Onecms;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Create an instance of the class to invoke the constructor
        DataBaseConnection c1 = new DataBaseConnection();
    }

    Connection connn;
    Statement st;

    // Constructor with the same name as the class
    public DataBaseConnection() {
        try {
            String URL = "jdbc:mysql://localhost:3306/CMS";
            String PASSWORD = "";
            String USERNAME = "root";
            connn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connn.createStatement();
            
            // Create table query with id as auto-increment primary key
//           
         String query = "CREATE TABLE IF NOT EXISTS cms.Instructor ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY,"
                   + "full_name VARCHAR(100) NOT NULL," // Adjust the size as needed
                   + "Contact_no VARCHAR(15) NOT NULL,"
                   + "address VARCHAR(255) NOT NULL,"
                   + "emails VARCHAR(255) NOT NULL,"
                   + "passwords VARCHAR(50) NOT NULL,"
                   + "roles VARCHAR(20) NOT NULL,"
                   + "courses VARCHAR(50))";


//
////            
           // Execute the query to create the table
           st.executeUpdate(query);
            System.out.println("Table created successfully!");

//            // Insert sample data (replace with your actual data)
//            String insertDataQuery = "INSERT INTO cms.Student (usernames, emails, passwords, roles) VALUES "
//                    + "('user1', 'user1@email.com', 'pass1', 'Admin'),"
//                    + "('user2', 'user2@email.com', 'pass2', 'Instructor'),"
//                    + "('user3', 'user3@email.com', 'pass3', 'Student')";
//            
//            // Execute the query to insert sample data
//            st.executeUpdate(insertDataQuery);
//            System.out.println("Sample data inserted successfully!");

            System.out.println("CONNECTED!");
        } catch (Exception e) {
            System.out.println("Connection Failed with the Database: Con.java " + e);
        }
    }
}
