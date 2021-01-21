package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public SaleService saleService;
    public boolean isOrdered;

    public OrderDto(SaleService saleService, boolean isOrdered) {
        this.saleService = saleService;
        this.isOrdered = isOrdered;
    }

    public SaleService getSale() {
        return saleService;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
