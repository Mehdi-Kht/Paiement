module com.example.paiement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.paiement to javafx.fxml;
    exports com.example.paiement;
}