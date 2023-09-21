module com.example.animalguesser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.animalguesser to javafx.fxml;
    exports com.example.animalguesser;
}