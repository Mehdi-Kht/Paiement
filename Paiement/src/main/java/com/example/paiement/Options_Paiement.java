package com.example.paiement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Options_Paiement {

    @FXML
    private void finaliserPaiementDebit(ActionEvent event) throws IOException {
        chargerConfirmation(event, "Vous avez payé en Débit");
    }

    @FXML
    private void finaliserPaiementVisa(ActionEvent event) throws IOException {
        chargerConfirmation(event, "Vous avez payé en VISA");
    }

    @FXML
    private void finaliserPaiementMaster(ActionEvent event) throws IOException {
        chargerConfirmation(event, "Vous avez payé en MasterCard");
    }

    private void chargerConfirmation(ActionEvent event, String message) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("confirmation-view.fxml"));
        Parent root = loader.load();

        // Accéder au contrôleur et définir le message
        ConfirmationController controller = loader.getController();
        controller.setMessage(message);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}