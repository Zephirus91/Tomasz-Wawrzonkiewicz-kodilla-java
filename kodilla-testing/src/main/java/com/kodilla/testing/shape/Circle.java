package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void getShapeName() {
        System.out.println("Circle");
    }

    @Override
    public void getField() {
        System.out.println(3.14*r*r);

    }
}
