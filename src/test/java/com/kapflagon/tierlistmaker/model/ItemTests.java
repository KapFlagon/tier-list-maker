package com.kapflagon.tierlistmaker.model;

import javafx.scene.image.Image;
import org.junit.jupiter.api.Test;

import java.io.InputStream;


import static org.junit.jupiter.api.Assertions.*;

public class ItemTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void createItemWithNameAlone() {
        String name = "My item";
        Item item = new Item(name);
        assertEquals(name, item.getItemName());
    }

    @Test
    void changeItemName() {
        String oldName = "My old item name";
        String newName = "My new item name";
        Item item = new Item(oldName);
        item.setItemName(newName);
        assertAll(
                () -> assertNotEquals(oldName, item.getItemName()),
                () -> assertEquals(newName, item.getItemName())
        );
    }

    @Test
    void createItemWithImage() {
        String itemName = "Test item";
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("com/kapflagon/tierlistmaker/files/images/TestImage_1.png");
        Image image = new Image(inputStream);
        Item item = new Item(itemName, image);
        assertEquals(image, item.getItemImage());
    }

    @Test
    void changeItemImage() {
        String itemName = "Test item";
        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream inputStream_1 = classLoader.getResourceAsStream("com/kapflagon/tierlistmaker/files/images/TestImage_1.png");
        Image image_1 = new Image(inputStream_1);
        Item item = new Item(itemName, image_1);
        InputStream inputStream_2 = classLoader.getResourceAsStream("com/kapflagon/tierlistmaker/files/images/TestImage_2.png");
        Image image_2 = new Image(inputStream_2);
        item.setItemImage(image_2);
        assertAll(
                () -> assertNotEquals(image_1, item.getItemImage()),
                () -> assertEquals(image_2, item.getItemImage())
        );
    }


}
