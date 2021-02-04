package com.kodilla.paterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskExecuted = false;

    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        taskExecuted = true;
        System.out.println("I need to buy " + whatToBuy + " in the number of " + quantity);
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }


}
