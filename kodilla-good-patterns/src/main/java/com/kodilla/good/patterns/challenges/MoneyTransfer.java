package com.kodilla.good.patterns.challenges;

public class MoneyTransfer implements PaymentService {
    public void newPayment(Client client, Seller seller) {
        System.out.println("Client " + client + " has transfered money to " + seller + ". ");
    }
}
