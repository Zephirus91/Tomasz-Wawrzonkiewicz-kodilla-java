package com.kodilla.good.patterns.challenges.Food2Door;



public class OrderApplication {

    public static void main(String[] args) {
        Order order = new Order(DelivererFactory.EXTRA_FOOD_SHOP, "Cabbage", 5);
        Wholesale wholesale = new Wholesale();
        wholesale.processOrder(order);
    }
}
