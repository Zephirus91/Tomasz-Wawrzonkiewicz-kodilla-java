package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }

    @Override
    public void getField() {
        System.out.println(a * h/2);
    }
}
