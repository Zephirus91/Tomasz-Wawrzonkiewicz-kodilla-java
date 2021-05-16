package com.kodilla.patterns2.observer.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework math = new MathHomework();
        Homework history = new HistoryHomework();
        Homework english = new EnglishHomework();
        Mentor liuKang = new Mentor("Liu Kang");
        Mentor johnnyCage = new Mentor("Johnny Cage");
        Mentor shaoKahn = new Mentor("Shao Kahn");
        math.registerObserver(liuKang);
        math.registerObserver(johnnyCage);
        history.registerObserver(shaoKahn);
        english.registerObserver(johnnyCage);
        english.registerObserver(shaoKahn);

        //When
        math.addHomework("Euclides algorithm");
        math.addHomework("Algebra");
        history.addHomework("World War II");
        english.addHomework("Learning words");
        english.addHomework("Grammar");
        english.addHomework("Phrases");

        //Then
        assertEquals(2, liuKang.getUpdateCount());
        assertEquals(5, johnnyCage.getUpdateCount());
        assertEquals(4, shaoKahn.getUpdateCount());


    }
}