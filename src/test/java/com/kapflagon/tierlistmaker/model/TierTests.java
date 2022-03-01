package com.kapflagon.tierlistmaker.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TierTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void testNewTierCreation() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        assertEquals(tierName, tier.getName());
        assertEquals(0, tier.getPosition());
    }

    @Test
    void testTierNameChange() {
        String oldTierName = "My old name";
        String newTierName = "My new name";
        Tier tier = new Tier(oldTierName);
        tier.setName(newTierName);
        assertAll(
                () -> assertNotEquals(oldTierName, tier.getName()),
                () -> assertEquals(newTierName, tier.getName())
        );
    }

    @Test
    void addTierItem() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        Item item = new Item("My item");
        tier.addItem(item);
        assertAll(
                () -> assertEquals(1, tier.getItems().size()),
                () -> assertEquals(item, tier.getItems().get(0))
        );
    }

    @Test
    void setTierItems() {
        Tier tier = new Tier("My tier");
        List<Item> itemsList = new ArrayList<>();
        for(int iterator = 0; iterator < 3; iterator++) {
            Item item = new Item("My Item " + iterator);
            itemsList.add(item);
        }
        tier.setItems(itemsList);

        assertEquals(itemsList, tier.getItems());
    }

    @Test
    void removeTierItem() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        Item item = new Item("My item");
        tier.addItem(item);
        assertEquals(1, tier.getItems().size());
        tier.removeItem(item);
        assertEquals(0, tier.getItems().size());
    }

    @Test
    void changeTierPosition() {
        int oldPosition = 0;
        int newPosition = 1;
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        assertEquals(oldPosition, tier.getPosition());
        tier.setPosition(newPosition);
        assertAll(
                () -> assertNotEquals(oldPosition, tier.getPosition()),
                () -> assertEquals(newPosition, tier.getPosition())
        );
    }

}
