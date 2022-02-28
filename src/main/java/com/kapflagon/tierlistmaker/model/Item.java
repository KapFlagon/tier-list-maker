package com.kapflagon.tierlistmaker.model;

import javafx.scene.image.Image;

public class Item {


    // Variables
    private String itemName;
    private Image itemImage;


    // Constructors
    public Item(String itemName) {
        this.itemName = itemName;
    }

    public Item(String itemName, Image itemImage) {
        this.itemName = itemName;
        this.itemImage = itemImage;
    }


    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Image getItemImage() {
        return itemImage;
    }

    public void setItemImage(Image itemImage) {
        this.itemImage = itemImage;
    }


    // Initialisation methods


    // Other methods


}
