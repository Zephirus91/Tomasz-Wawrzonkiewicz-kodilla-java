package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MixedPizzaDecorator extends AbstractPizzaOrderDecorator {

    public MixedPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(40));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " sausage, onion, green pepper, cheese, chopped steak";
    }
}
