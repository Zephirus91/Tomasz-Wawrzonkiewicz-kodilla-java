package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAddToDoList() {
        //Given
        ApplicationContext context=
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("to do task");
        String task = board.getToDoList().getTask(0);

        //Then
        assertEquals("to do task", task);
    }

    @Test
    public void testTaskAddInProgressList() {
        //Given
        ApplicationContext context=
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getInProgressList().addTask("task in progress");
        String task = board.getInProgressList().getTask(0);

        //Then
        assertEquals("task in progress", task);
    }

    @Test
    public void testTaskAddGetDoneList() {
        //Given
        ApplicationContext context=
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("done task");
        String task = board.getDoneList().getTask(0);

        //Then
        assertEquals("done task", task);
    }
}
