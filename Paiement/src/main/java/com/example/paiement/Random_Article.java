package com.example.paiement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

public class Random_Article {

    @FXML
    private Label articleLabel;
    @FXML
    private Label prixLabel;

    private double prix;
    private String article;

    private static final Map<Double, String> articles = Map.of(
            9.99, "Casque Bluetooth",
            10.99, "Montre Connectée",
            2.99, "Tasse Thermique",
            99.99, "Apple Watch SE",
            19.99, "Mini Projecteur",
            200.00, "IPHONE 16 PRO MAX",
            100.00, "Ipad air"
    );

    @FXML
    private void genererArticleAleatoire() {
        Double[] prixPossibles = articles.keySet().toArray(new Double[0]);
        int index = new Random().nextInt(prixPossibles.length);
        prix = prixPossibles[index];
        article = articles.get(prix);
        prixLabel.setText(String.format("%.2f $", prix));
        articleLabel.setText(article);
    }

    @FXML
    public void paiement(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("paiement-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}