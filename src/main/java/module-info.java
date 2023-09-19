module com.example.cliqueshoppa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cliqueshoppa to javafx.fxml;
    exports com.example.cliqueshoppa;
}