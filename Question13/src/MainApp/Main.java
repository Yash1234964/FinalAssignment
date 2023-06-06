package MainApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase"; 
        String username = "your-username"; 
        String password = "your-password"; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            
            String filename = "data.txt"; 
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            
            String sql = "INSERT INTO mytable (column1, column2) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            String line;
            int batchSize = 100; 

          
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String value1 = data[0].trim();
                String value2 = data[1].trim();

                statement.setString(1, value1);
                statement.setString(2, value2);
                statement.addBatch();

                
                if ((statement).getFetchSize() % batchSize == 0) {
                    statement.executeBatch();
                }
            }

            
            statement.executeBatch();

         
            reader.close();
            statement.close();
            connection.close();

            System.out.println("Batch update completed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
