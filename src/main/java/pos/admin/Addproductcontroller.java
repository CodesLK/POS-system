package pos.admin;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;

public class Addproductcontroller {
    @FXML
private TextField price;
    private final FileChooser fileChooser = new FileChooser();
    private final Window primaryStage; // Can be a member variable

    public Addproductcontroller(Stage primaryStage) { // Example with constructor injection
        this.primaryStage = primaryStage;
        fileChooser.setTitle("Select Image File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"));
    }


    public void pickImage() { // Example method for image selection
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            // Load the image from the selected file
            Image image = new Image(selectedFile.toURI().toString());

            // Use the image object for display or processing
            // ...
        }
    }
    public void addproductform(){

    }
    public void numbervalidate(){
        price.setOnKeyPressed(e -> {
            if (!e.getCode().isDigitKey() && !e.getCode().equals(KeyCode.BACK_SPACE)) {
                e.consume();
            }
        });
    }

}
