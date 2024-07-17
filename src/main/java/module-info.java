module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens seller to javafx.fxml;
    exports seller;
}