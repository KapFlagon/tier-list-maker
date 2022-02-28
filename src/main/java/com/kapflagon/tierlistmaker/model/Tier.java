package com.kapflagon.tierlistmaker.model;

import java.util.ArrayList;
import java.util.List;

public class Tier {


    // Variables
    private String tierName;
    private List<Item> tierItems;


    // Constructors
    public Tier(String tierName) {
        this.tierName = tierName;
        this.tierItems = new ArrayList<>();
    }


    // Getters and Setters
    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public List<Item> getTierItems() {
        return tierItems;
    }

    public void setTierItems(List<Item> tierItems) {
        this.tierItems = tierItems;
    }


    // Initialisation methods


    // Other methods


}
