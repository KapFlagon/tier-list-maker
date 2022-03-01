package com.kapflagon.tierlistmaker.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TierList {


    // Variables
    private String name;
    private List<Tier> tiers;


    // Constructors

    public TierList(String name) {
        this.name = name;
        tiers = new ArrayList<>();
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tier> getTiers() {
        return tiers;
    }

    public void setTiers(List<Tier> tiers) {
        this.tiers = tiers;
    }



    // Initialisation methods

    // Other methods

    public void addTier(Tier tier) {
        tiers.add(tier);
    }


    public void insertTierAtPosition(int insertionPosition, Tier tierForInsertion) {
        tiers.add(insertionPosition, tierForInsertion);
        updateTierPositions();
    }

    private void updateTierPositions() {
        for (int iterator = 0; iterator < tiers.size(); iterator++) {
            tiers.get(iterator).setPosition(iterator);
        }
    }
}
