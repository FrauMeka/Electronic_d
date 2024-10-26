module com.example.electronic_devicesss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronic_devicesss to javafx.fxml;
    exports com.example.electronic_devicesss;
}