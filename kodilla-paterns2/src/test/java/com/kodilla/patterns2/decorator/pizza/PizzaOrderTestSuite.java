package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with", description);
    }

    @Test
    public void testSuperPizzaDecoratorGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SuperPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculatedCost);
    }

    @Test
    public void testSuperPizzaDecoratorGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SuperPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with mushrooms, ham, cheese, pineapple, bacon", description);
    }

    @Test
    public void testCheesyAndMeatPizzaDecoratorGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesyPizzaDecorator(theOrder);
        theOrder = new MeatPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(45), calculatedCost);
    }

    @Test
    public void testCheesyAndMeatPizzaDecoratorGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesyPizzaDecorator(theOrder);
        theOrder = new MeatPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheddar cheese, blue cheese, brie cheese, salami, ham, bacon,", description);
    }

    @Test
    public void testSpicySauceAndVegetarianAndCheesyPizzaGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SpicySauceDecorator(theOrder);
        theOrder = new VegetarianPizzaDecorator(theOrder);
        theOrder = new CheesyPizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), calculatedCost);
    }

    @Test
    public void testSpicySauceAndVegetarianAndCheesyPizzaGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SpicySauceDecorator(theOrder);
        theOrder = new VegetarianPizzaDecorator(theOrder);
        theOrder = new CheesyPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with chilli sauce, red pepper, tomato, green olives, " +
                "corn cheddar cheese, blue cheese, brie cheese,", description);

    }

    @Test
    public void testHorriblePizzaDecoratorGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HorriblePizzaDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(100), calculatedCost);
    }

    @Test
    public void testHorriblePizzaDecoratorGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HorriblePizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese, olives, pineapple, chocolate", description);
    }
}
