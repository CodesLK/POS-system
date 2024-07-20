package pos.admin;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import pos.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import static javafx.scene.control.Alert.AlertType.ERROR;
import static javafx.scene.control.Alert.AlertType.INFORMATION;
public class Addproductcontroller {
    @FXML
    private TextField brandtxt;
public void addbrand()  {
        if (brandtxt.getText().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Error", "Error", "Brand name cannot be empty.");
        } else {
            addbranddb(brandtxt.getText());
        }
    }
    public void clearbrand(){
      brandtxt.setText("");
    }
    public static void addbranddb(String brandname){
        try  {
            Connection connection = DatabaseConnectionManager.getConnection();
            String sql = "INSERT INTO brand (brand_name) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, brandname);
            statement.executeUpdate();
            Alert alert = new Alert(INFORMATION);
            alert.setTitle("gh");
            alert.setHeaderText("success");
            alert.setContentText("success");
            alert.showAndWait();
            connection.close();
        } catch (SQLIntegrityConstraintViolationException e) {
            DatabaseConnectionManager.showAlert(Alert.AlertType.WARNING, "Error", "Error", "Duplicate Entry");
        } catch (SQLException ignored) {
        }
    }
    private void showAlert(Alert.AlertType alertType, String title, String headerText, String contentText) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}


