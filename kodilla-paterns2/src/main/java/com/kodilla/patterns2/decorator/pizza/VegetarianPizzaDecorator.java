package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetarianPizzaDecorator extends AbstractPizzaOrderDecorator {

    public VegetarianPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " red pepper, tomato, green olives, corn";
    }

}
