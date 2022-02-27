package com.kapflagon.tierlistmaker.model;

import com.kapflagon.tierlistmaker.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void testCreateItemWithName() {
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
    void addItemImage() {
        Item item = new Item("Test item");
        //item.setItemImage();

    }

    @Test
    void changeItemImage() {

    }


}
