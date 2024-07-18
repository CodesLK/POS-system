module pos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens pos.admin to javafx.fxml;
    exports pos.admin;
    opens pos.seller to javafx.fxml;
    exports pos.seller;
}