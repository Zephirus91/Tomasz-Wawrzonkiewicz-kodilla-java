package com.kodilla.paterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String colour;
    private final String whatToPaint;
    boolean taskExecuted;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
        this.taskExecuted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        taskExecuted = true;
        System.out.println("I need to paint " + whatToPaint + " with colour " + colour);
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
