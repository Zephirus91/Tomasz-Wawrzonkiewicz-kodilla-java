package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String description = "description of the task";
    private static final String listName = "name of the list";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, description);

        //When
        taskListDao.save(taskList);
        String name = taskList.getListName();
        List<TaskList> taskLists = taskListDao.findByListName(name);

        //Then
        assertEquals(1, taskLists.size());

        //CleanUp
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
