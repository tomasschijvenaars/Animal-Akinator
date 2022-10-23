module com.example.animalguesser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animalguesser to javafx.fxml;
    exports com.example.animalguesser;
}