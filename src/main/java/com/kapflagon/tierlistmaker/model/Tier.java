package com.kapflagon.tierlistmaker.model;

import java.util.ArrayList;
import java.util.List;

public class Tier {


    // Variables
    private String name;
    private List<Item> items;


    // Constructors
    public Tier(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    // Initialisation methods


    // Other methods


}
