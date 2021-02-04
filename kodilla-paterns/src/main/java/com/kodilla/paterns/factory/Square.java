package com.kodilla.paterns.factory;

public class Square implements Shape {
    private final String name;
    private final double width;

    public Square(String name, double width) {
        this.name = name;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getArea() {
        return Math.pow(width, 2.0);
    }

    public double getCircumference() {
        return 4 * width;
    }
}
