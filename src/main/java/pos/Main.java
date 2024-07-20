package pos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void insertData(String column1Value, int column2Value) {
        String insertSQL = "INSERT INTO yourTableName (column1, column2) VALUES (?, ?)";
        Connection connection = DatabaseConnectionManager.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
                preparedStatement.setString(1, column1Value);
                preparedStatement.setInt(2, column2Value);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        insertData("SampleValue", 123);
    }
}
