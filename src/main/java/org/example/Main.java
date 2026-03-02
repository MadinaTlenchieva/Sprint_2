package org.example;

import org.example.model.Apple;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;
import org.example.model.Food;

public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(items);

        System.out.printf("Сумма без скидки: %.2f%n",
                cart.getTotalPriceWithoutDiscount());

        System.out.printf("Сумма со скидкой: %.2f%n",
                cart.getTotalPriceWithDiscount());

        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n",
                cart.getTotalVegetarianPriceWithoutDiscount());
    }
}