package pos.seller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class addProductController implements Initializable{
    @FXML
    private ChoiceBox<String> cbCatagory;

    private String[] catagory={"Iphone","headphones","covers","powerbanks"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbCatagory.getItems().addAll(catagory);

        cbCatagory.setOnAction((ActionEvent e)->{
            System.out.println(cbCatagory.getValue());
        });

    }


}
