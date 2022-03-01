package com.kapflagon.tierlistmaker.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TierListTests {


    // Variables


    // Constructors


    // Getters and Setters


    // Initialisation methods


    // Other methods
    @Test
    void createNewTierList() {
        String tierListName = "My tier list";
        TierList tierList = new TierList(tierListName);
        assertEquals(tierListName, tierList.getName());
    }

    @Test
    void changeTierListName() {
        String oldName = "My old name";
        String newName = "My new name";
        TierList tierList = new TierList(oldName);
        tierList.setName(newName);
        assertAll(
                () -> assertNotEquals(oldName, tierList.getName()),
                () -> assertEquals(newName, tierList.getName())
        );
    }

    @Test
    void addTierToTierList() {
        TierList tierList = new TierList("My TierList");
        Tier tier = new Tier("My Tier");
        tierList.addTier(tier);
        assertAll(
                () -> assertEquals(1, tierList.getTiers().size()),
                () -> assertEquals(tier, tierList.getTiers().get(0))
        );
    }

    @Test
    void insertTierInTierListAtPositionZero() {
        TierList tierList = new TierList("My TierList");
        List<Tier> testTiers = new ArrayList<>();
        for(int iterator = 0; iterator < 3; iterator++) {
            Tier innerTestTier = new Tier("My Tier " + iterator);
            testTiers.add(innerTestTier);
        }
        List<Tier> testTiersCopy = new ArrayList<>(testTiers);
        tierList.setTiers(testTiers);
        Tier tierForInsertion = new Tier("Inserted Tier");
        tierList.insertTierAtPosition(0, tierForInsertion);

        assertAll(
                () -> assertNotEquals(testTiersCopy.get(0), tierList.getTiers().get(0)),
                () -> assertNotEquals(testTiersCopy.get(1), tierList.getTiers().get(1)),
                () -> assertNotEquals(testTiersCopy.get(2), tierList.getTiers().get(2)),
                () -> assertNotEquals(tierForInsertion, tierList.getTiers().get(3)),
                () -> assertEquals(tierForInsertion, tierList.getTiers().get(0)),
                () -> assertEquals(0, tierList.getTiers().get(0).getPosition()),
                () -> assertEquals(1, tierList.getTiers().get(1).getPosition()),
                () -> assertEquals(2, tierList.getTiers().get(2).getPosition()),
                () -> assertEquals(3, tierList.getTiers().get(3).getPosition())
        );
    }

    @Test
    void removeTierFromTierList() {

    }


}
