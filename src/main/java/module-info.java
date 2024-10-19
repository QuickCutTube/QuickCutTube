module com.example.epitome {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;
    requires java.sql;

    opens com.example.epitome to javafx.fxml;
    exports com.example.epitome;
    exports com.example.epitome.controller;
    opens com.example.epitome.controller to javafx.fxml;
}