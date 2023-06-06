package MainApp;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practise";
        String username = "your-username"; 
        String password = "your-password"; 

        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

          
            Connection connection = DriverManager.getConnection(url, username, password);

           
            Statement statement = connection.createStatement();

            
            String query = "SELECT * FROM mytable"; 
            ResultSet resultSet = statement.executeQuery(query);

            
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); 
                String name = resultSet.getString("name"); 
                int age = resultSet.getInt("age"); 

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

         
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
