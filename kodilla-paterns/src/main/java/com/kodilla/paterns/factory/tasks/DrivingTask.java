package com.kodilla.paterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskExecuted = false;
    }


    @Override
    public String getTaskName() {
        return taskName;
    }


    public void executeTask() {
        taskExecuted = true;
        System.out.println("Driving to the " + where + " by " + using);
    }


    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
