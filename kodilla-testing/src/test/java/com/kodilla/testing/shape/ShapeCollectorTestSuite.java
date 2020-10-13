package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));

        //When
        shapeCollector.addFigure(new Triangle(1,1));
        Triangle triangle = new Triangle(1,1);

        //Then
        Assertions.assertEquals(1, shapeCollector.getFigure(triangle));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));
        shapeCollector.addFigure(new Triangle(1,1));

        //When
        boolean result = shapeCollector.removeFigure(new Triangle(1,1));
        Triangle triangle = new Triangle(1,1);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getFigure(triangle));

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Triangle(1,1));
        Shape triangle = new Triangle(1,1);
        shapeCollector.addFigure(triangle);

        //When
        Shape result = shapeCollector.getFigure(triangle);

        //Then
        Assertions.assertEquals(triangle, result);

    }
}
