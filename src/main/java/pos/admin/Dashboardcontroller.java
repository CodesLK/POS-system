package pos.admin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.sql.SQLException;

public class Dashboardcontroller {

    @FXML
    private Button addproductbtn;

    Database db= new Database();

    public Dashboardcontroller() throws SQLException {
    }
    @FXML
    protected void onaddproductButtonClick() {

    }



}