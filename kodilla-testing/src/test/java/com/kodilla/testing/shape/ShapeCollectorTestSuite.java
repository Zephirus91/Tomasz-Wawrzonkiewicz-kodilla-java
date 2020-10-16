package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Triangle(1,1));

        //Then
        Assertions.assertEquals(new Triangle(1,1), shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(1,1));

        //When
        boolean result = shapeCollector.removeFigure(new Triangle(1,1));

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getShapes().size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1,1);
        shapeCollector.addFigure(triangle);

        //When
        Shape result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(triangle, result);

    }
}
