package com.kodilla.good.patterns.challenges.Food2Door;

public class Wholesale {

    public void processOrder(Order order) {
        String delivererName = order.getDeliverer();
        Deliveler deliveler = DelivererFactory.getDeliveler(delivererName);
        deliveler.processOrder(order);
    }
}
