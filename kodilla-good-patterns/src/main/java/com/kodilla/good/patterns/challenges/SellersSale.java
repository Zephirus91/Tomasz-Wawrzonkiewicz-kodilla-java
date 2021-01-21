package com.kodilla.good.patterns.challenges;

public class SellersSale implements SaleService {
    public boolean createOrder(Seller seller, Client client, Product product) {
        System.out.println("Seller " + seller + " created an order for "
                + client + ". Client have ordered " + product.getQuantity() + " " + product);
        return true;
    }
}
