package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));

        //When
        shapeCollector.addFigure(new Triangle(1,1));

        //Then
        Assertions.assertEquals(1, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));
        shapeCollector.addFigure(new Triangle(1,1));

        //When
        boolean result = shapeCollector.removeFigure(new Triangle(1,1));

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getFigure(0)); //tutaj wg. mnie powinienem mieć kolejną klasę w ShapeCollector pokazującą wielkość listy

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));
        shapeCollector.addFigure(new Triangle(1,1));

        //When
        int retrievedShape = shapeCollector.getFigure(0);

        //Then



    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));

        //When
        shapeCollector.showFigures();

        //Then
        Assertions.assertEquals("Circle, Square, Triangle", shapeCollector.showFigures());

    }
}
