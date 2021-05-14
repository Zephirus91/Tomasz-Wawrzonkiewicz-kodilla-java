package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HorriblePizzaDecorator extends AbstractPizzaOrderDecorator {

    public HorriblePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(90));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " tomato sauce, cheese, olives, pineapple, chocolate";
    }
}
