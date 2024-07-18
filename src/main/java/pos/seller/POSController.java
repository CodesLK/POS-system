package pos.seller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class POSController{
    @FXML
    private Pane homePane;

    @FXML
    private Button btnLogin;

    private  Stage stage;
    public void btnOpenActionPerformed(){
        TranslateTransition transition=new TranslateTransition();
        transition.setNode(homePane);
        transition.setByY(homePane.getLayoutY()-745);
        transition.play();



    }
    public void btnLoginActionPerformed(ActionEvent event) throws IOException {


        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(POSapplication.class.getResource("Manager.fxml"));
        Scene scene=new Scene(root);
        String style=POSapplication.class.getResource("manager-style.css").toExternalForm();
        scene.getStylesheets().add(style);
        stage.setScene(scene);
        stage.show();

    }
}