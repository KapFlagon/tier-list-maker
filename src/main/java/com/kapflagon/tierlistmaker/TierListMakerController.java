package com.kapflagon.tierlistmaker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

import java.io.File;

import static com.sun.javafx.tk.Toolkit.getToolkit;

public class TierListMakerController {
    @FXML
    private Label welcomeText;
    @FXML
    private VBox vbox;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void dragDropped(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        String result = "";
        if (dragboard.hasFiles()) {
            result = "Files\nName: " + dragboard.getFiles().get(0).getName() + "Path: " + dragboard.getFiles().get(0).getPath();
        } else if (dragboard.hasHtml()) {
            result = "HTML\nData:" + dragboard.getHtml().toString();
        } else if (dragboard.hasImage()) {
            result = "image";
        } else if (dragboard.hasRtf()) {
            result = "rtf";
        } else if (dragboard.hasString()) {
            result = "string";
        } else if (dragboard.hasUrl()) {
            result = "url";
        }
        System.out.println("Dragboard contains: " + result);
    }

    @FXML
    void dragOver(DragEvent event) {
        event.acceptTransferModes(TransferMode.COPY);
    }


}