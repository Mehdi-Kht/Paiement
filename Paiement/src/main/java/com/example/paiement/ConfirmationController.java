package com.example.paiement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConfirmationController {

    @FXML
    private Label message_confirmation;

    public void setMessage(String message) {
        message_confirmation.setText(message);
    }
}