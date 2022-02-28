package com.kapflagon.tierlistmaker.model;

import org.junit.jupiter.api.Test;
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
        tier.getItems().add(item);
        assertAll(
                () -> assertEquals(1, tier.getItems().size()),
                () -> assertEquals(item, tier.getItems().get(0))
        );
    }

    @Test
    void removeTierItem() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        Item item = new Item("My item");
        tier.getItems().add(item);
        assertEquals(1, tier.getItems().size());
        tier.getItems().remove(0);
        assertEquals(0, tier.getItems().size());
    }

}
