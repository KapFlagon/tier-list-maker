package com.kapflagon.tierlistmaker.model;

import javafx.scene.image.Image;

public class Item {


    // Variables
    private String name;
    private Image image;


    // Constructors
    public Item(String name) {
        this.name = name;
    }

    public Item(String name, Image image) {
        this.name = name;
        this.image = image;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }


    // Initialisation methods


    // Other methods


}
