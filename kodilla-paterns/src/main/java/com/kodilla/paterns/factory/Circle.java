package com.kodilla.paterns.factory;

public class Circle implements Shape {
    private final String name;
    private final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
