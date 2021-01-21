package com.kodilla.good.patterns.challenges;

public class InfoProvided {
    public InfoRequired provideOrderDetails() {
        Client client = new Client("Adam", "Nowak", 111222333, "Katowice, ul. Wschodnia 2");
        Product product = new Product("Speaker", 249.99, 4);
        Seller seller = new Seller("JBL", "Warszawa ul. Mikołowska 25/4", "jbl@jbl.com");

        return new InfoRequired(client, product, seller);
    }
}
