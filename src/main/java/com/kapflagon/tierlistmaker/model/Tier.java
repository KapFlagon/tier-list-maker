package com.kapflagon.tierlistmaker.model;

import java.util.ArrayList;
import java.util.List;

public class Tier {


    // Variables
    private String name;
    private int position;
    private List<Item> items;


    // Constructors
    public Tier(String name) {
        this.name = name;
        this.position = 0;
        this.items = new ArrayList<>();
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    // Initialisation methods


    // Other methods
    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }


}
