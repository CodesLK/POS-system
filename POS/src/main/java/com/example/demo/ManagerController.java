package com.example.demo;

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

public class ManagerController {

    @FXML
    private Pane dashboard;
    @FXML
    private Pane inventory;

    @FXML
    private Pane paneAccount;

    @FXML
    private Pane paneSells;

    @FXML
    private Pane empPane;

    @FXML
    private Button btnAddItem;

    @FXML
    private Button btnAddEmp;


    public void btnDashboardActionPerformed(ActionEvent event){

        show(dashboard);
    }
    public void btnSellsActionPerformed(ActionEvent event){
        show(paneSells);
    }
    public void btnInventoryActionPerformed(ActionEvent event){
       show(inventory);
    }

    public void btnEmployeActionPerformed(ActionEvent event){
        show(empPane);
    }
    public void btnAccountActionPerformed(ActionEvent event){

        show(paneAccount);
    }
    public void btnSettingsActionPerformed(ActionEvent event){

    }

    public void btnAddItemActionPerfromed(ActionEvent event) throws IOException {

        Stage stage=new Stage();
        Parent root= FXMLLoader.load(POSapplication.class.getResource("AddProduct.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();



    }

    public void setBtnAddEmpActionPerformed(ActionEvent event) throws IOException{
        Stage stage=new Stage();
        Parent root= FXMLLoader.load(POSapplication.class.getResource("AddEmploye.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }



    public void show(Pane element){

        dashboard.setVisible(false);
        paneSells.setVisible(false);
        paneAccount.setVisible(false);
        inventory.setVisible(false);
        empPane.setVisible(false);

        element.setVisible(true);
    }
}
