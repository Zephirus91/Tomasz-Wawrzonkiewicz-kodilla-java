package com.kodilla.good.patterns.challenges;

public class InfoRequired {
    private final Client client;
    private final Product product;
    private final Seller seller;

    public InfoRequired(Client client, Product product, Seller seller) {
        this.client = client;
        this.product = product;
        this.seller = seller;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public Seller getSeller() {
        return seller;
    }
}
