package com.kapflagon.tierlistmaker.model;

import java.util.ArrayList;
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


    // Initialisation methods


    // Other methods


}
