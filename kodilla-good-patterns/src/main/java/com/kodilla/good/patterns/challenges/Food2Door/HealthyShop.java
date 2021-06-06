package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Deliveler {

    @Override
    public void processOrder(Order order) {
        System.out.println("HS ordered " + order.getQuantity() + " " + order.getProduct());
    }
}
