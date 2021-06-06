package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Deliveler {

    @Override
    public void processOrder(Order order) {
        System.out.println("GFS ordered " + order.getQuantity() + " " + order.getProduct());
    }
}
