package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class StatisticsCalcTestSuite {

   /* @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPostsNull() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        int postsCount1 = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);

        //When
        int quantityOfPosts = statisticsCalc.calculateAdvStatistics();

        //Then
        Assertions.assertEquals(0,quantityOfPosts);

    }

    @Test
    void testCalculateAdvStatisticsPosts1000() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        int postsCount1 = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount1);

        //When
        int quantityOfPosts = statisticsCalc.calculateAdvStatistics();

        //Then
        Assertions.assertEquals(1000, quantityOfPosts);

    }

    @Test
    void testCalculateAdvStatisticsCommentsNull() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        int commentsCount1 = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount1);

        //When
        int quantityOfComments = statisticsCalc.calculateAdvStatistics();

        //Then
        Assertions.assertEquals(0, quantityOfComments);

    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        int commentsCount = 10;
        int postsCount = 20;

        //When
        boolean commentsLessThanPosts = commentsCount < postsCount;

        //Then
        Assertions.assertTrue(commentsLessThanPosts);

    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        int commentsCount = 20;
        int postsCount = 10;

        //When
        boolean commentsMoreThanPosts = commentsCount > postsCount;

        //Then
        Assertions.assertTrue(commentsMoreThanPosts);

    }

    @Test
    void testCalculateAdvStatisticsUsersNull() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> namesOfUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(namesOfUsers);

        //When
        int quantityOfUsers = statisticsCalc.calculateAdvStatistics().size();

        //Then
        Assertions.assertEquals(0,quantityOfUsers);

    }

    @Test
    void testCalculateAdvStatisticsUsers100() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> namesOfUsers = new ArrayList<>(); //Jak tutaj dodać 100 użytkowników ?
        namesOfUsers.add("Tom Qwerty");
        when(statisticsMock.usersNames()).thenReturn(namesOfUsers);

        //When
        int quantityOfUsers = statisticsCalc.calculateAdvStatistics().size();

        //Then
        Assertions.assertEquals(100,quantityOfUsers);


    }*/
}
