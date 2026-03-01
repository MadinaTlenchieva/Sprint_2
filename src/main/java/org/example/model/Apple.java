package org.example.model;

import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}