package com.kapflagon.tierlistmaker.model;

import org.junit.jupiter.api.Test;
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


}
