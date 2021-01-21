package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final MessageService messageService;
    private final OrderRepository orderRepository;
    private final PaymentService paymentService;
    private final SaleService saleService;

    public ProductOrderService(MessageService messageService, OrderRepository orderRepository, PaymentService paymentService, SaleService saleService) {
        this.messageService = messageService;
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
        this.saleService = saleService;
    }

    public OrderDto process(InfoRequired infoRequired) {
        boolean isOrdered = saleService.createOrder(infoRequired.getSeller(), infoRequired.getClient(), infoRequired.getProduct());

        if(isOrdered) {
            messageService.sendMessageToClient((infoRequired.getClient()));
            messageService.sendMessageToSeller(infoRequired.getSeller());
            orderRepository.addOrder(infoRequired.getClient(), infoRequired.getProduct(), infoRequired.getSeller());
            paymentService.newPayment(infoRequired.getClient(), infoRequired.getSeller());
            return new OrderDto(saleService, true);
        } else {
            return new OrderDto(saleService, false);
        }
    }
}
