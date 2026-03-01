package org.example.service;

import org.example.model.Discountable;
import org.example.model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;

        for (Food item : items) {
            double itemTotal = item.getAmount() * item.getPrice();

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                double discount = discountable.getDiscount();
                itemTotal -= itemTotal * discount / 100;
            }

            total += itemTotal;
        }

        return total;
    }

    // Сумма всех вегетарианских продуктов без скидки
    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;

        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }

        return total;
    }
}