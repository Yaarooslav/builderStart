package main;

import dish.builders.OrderBuilder;
import dish.drink.Water;

public class Aplication {
    public static void main(String[] args) {
        Order order = new OrderBuilder().addDrink(new Water()).build();
    }
}
