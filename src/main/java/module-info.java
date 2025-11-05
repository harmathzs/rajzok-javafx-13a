module com.example.rajzok13a {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.rajzok13a to javafx.fxml;
    exports com.example.rajzok13a;
}