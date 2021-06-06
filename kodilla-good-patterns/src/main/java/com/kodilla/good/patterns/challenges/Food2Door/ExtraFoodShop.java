package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Deliveler {

    @Override
    public void processOrder(Order order) {
        System.out.println("EFS ordered " + order.getQuantity() + " " + order.getProduct());
    }
}
