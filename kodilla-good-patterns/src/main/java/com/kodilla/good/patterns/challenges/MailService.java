package com.kodilla.good.patterns.challenges;

public class MailService implements MessageService {

    public void sendMessageToClient(Client client){
        System.out.println("Send message to " + client);
    }

    public void sendMessageToSeller(Seller seller) {
        System.out.println("Send message to " + seller);
    }
}
