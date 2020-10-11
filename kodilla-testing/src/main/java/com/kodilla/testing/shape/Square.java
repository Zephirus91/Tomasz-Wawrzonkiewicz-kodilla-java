package com.kodilla.testing.shape;

public class Square implements Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void getShapeName() {
        System.out.println("Square");
    }

    @Override
    public void getField() {
        System.out.println(a*a);
    }
}
