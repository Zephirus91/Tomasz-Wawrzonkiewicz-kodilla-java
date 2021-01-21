package com.kodilla.good.patterns.challenges;

public class Order implements OrderRepository {
    public void addOrder(Client client, Product product, Seller seller) {
        System.out.println("An order has been added. Yours data to this order. Client: "
                + client + ", seller: " + seller + ", product: " + product);
    }
}
