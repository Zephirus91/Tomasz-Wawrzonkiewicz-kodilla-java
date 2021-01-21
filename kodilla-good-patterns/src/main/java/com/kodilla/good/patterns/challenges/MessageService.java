package com.kodilla.good.patterns.challenges;

public interface MessageService {
    void sendMessageToClient(Client client);
    void sendMessageToSeller(Seller seller);
}
