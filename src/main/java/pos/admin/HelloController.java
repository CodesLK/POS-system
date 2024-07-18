package pos.admin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private Button addProductButton;
    @FXML
    private AnchorPane content;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Remove the unnecessary loading of the same FXML
    }

    public void home(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("add-product.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void viewproduct(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view-product.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void addproduct(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("add-product.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void addcategory(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("add-category.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void viewcategory(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("view-category.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void staffreport(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("staff-report.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void productreport(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("product-report.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void financialreport(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("financial-report.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void customers(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("customers.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void sales(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("sales.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void setting(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("setting.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void refund(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("refund.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }
    public void dashboard(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(fxml);
    }

}
