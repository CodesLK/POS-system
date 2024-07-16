package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class POSapplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(POSapplication.class.getResource("login.fxml"));
        Scene scene=new Scene(root);
        String style=POSapplication.class.getResource("style.css").toExternalForm();
        scene.getStylesheets().add(style);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}