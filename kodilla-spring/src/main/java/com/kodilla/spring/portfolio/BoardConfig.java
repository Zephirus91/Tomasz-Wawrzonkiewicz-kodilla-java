package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList1;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList2;

    @Autowired
    @Qualifier("doneList")
    TaskList taskList3;

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList(taskList1);
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList(taskList2);
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList(taskList3);
    }
}
