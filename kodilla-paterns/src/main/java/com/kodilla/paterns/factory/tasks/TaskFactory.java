package com.kodilla.paterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING";
    public static final String PAINTINGTASK = "PAINTING";
    public static final String DRIVINGTASK = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Let's buy something", "bread, butter, sugar", 5);
            case PAINTINGTASK:
                return new PaintingTask("Let's colour", "red", "car");
            case DRIVINGTASK:
                return new DrivingTask("Let's ride", "mountains", "bike");
            default:
                return null;
        }
    }
}
