package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {

    private String deliverer;
    private String product;
    private int quantity;

    public Order(String shop, String product, int quantity) {
        this.deliverer = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public String getDeliverer() {
        return deliverer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
