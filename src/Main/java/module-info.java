module com.example.projetointegradorjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.projetointegradorjava to javafx.fxml;
    exports com.example.projetointegradorjava;
}