package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        InfoProvided infoProvided = new InfoProvided();
        InfoRequired infoRequired = infoProvided.provideOrderDetails();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new Order(), new MoneyTransfer(),  new SellersSale());

        productOrderService.process(infoRequired);
    }
}
