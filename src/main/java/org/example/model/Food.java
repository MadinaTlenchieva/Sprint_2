package org.example.model;

public abstract class Food {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}