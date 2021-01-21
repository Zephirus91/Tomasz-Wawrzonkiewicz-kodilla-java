package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    void addOrder(Client client, Product product, Seller seller);
}
