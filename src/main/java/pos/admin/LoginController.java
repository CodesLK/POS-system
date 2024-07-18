package pos.admin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {
    @FXML
    private Label incorrectpwdlbl;
@FXML
    private TextField username;
@FXML
    private PasswordField password;
    @FXML
    private Button reset;
    @FXML
    private Button login;
    Database db= new Database();

    public LoginController() throws SQLException {
    }
int incorrectpwd = 0;
    @FXML
    protected void onLoginButtonClick() {
        try{
        Statement stmt= db.Connection();
        String query = "SELECT * FROM users WHERE username = '"+username.getText()+"' AND password = '"+password.getText()+"'";
        if(stmt.executeQuery(query).next()){
            db.Connection().close();
            incorrectpwdlbl.setText("Login Successful");
    }else {
            if(incorrectpwd == 3){
                incorrectpwdlbl.setText("You have entered the wrong password 3 times. Please try again later");
            }
            else{incorrectpwdlbl.setText("Incorrect Username or Password");
            }
            incorrectpwd++;
        }


    }catch (SQLException e){
        e.printStackTrace();

    }}
    @FXML
    protected void onResetButtonClick() {
    username.setText("");
    password.setText("");
    }
}