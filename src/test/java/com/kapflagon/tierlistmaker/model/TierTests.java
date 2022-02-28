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
        assertEquals(tierName, tier.getTierName());
    }

    @Test
    void testTierNameChange() {
        String oldTierName = "My old name";
        String newTierName = "My new name";
        Tier tier = new Tier(oldTierName);
        tier.setTierName(newTierName);
        assertAll(
                () -> assertNotEquals(oldTierName, tier.getTierName()),
                () -> assertEquals(newTierName, tier.getTierName())
        );
    }

    @Test
    void addTierItem() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        Item item = new Item("My item");
        tier.getTierItems().add(item);
        assertAll(
                () -> assertEquals(1, tier.getTierItems().size()),
                () -> assertEquals(item, tier.getTierItems().get(0))
        );
    }

    @Test
    void removeTierItem() {
        String tierName = "My Tier";
        Tier tier = new Tier(tierName);
        Item item = new Item("My item");
        tier.getTierItems().add(item);
        assertEquals(1, tier.getTierItems().size());
        tier.getTierItems().remove(0);
        assertEquals(0, tier.getTierItems().size());
    }

}
