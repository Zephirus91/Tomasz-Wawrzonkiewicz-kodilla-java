package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class StatisticsCalcTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPostsZero() {

        //Given

        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add(1,"John");
        users1.add(2,"Jack");
        int postsCount1 = 0;
        int comments1 = 10;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsCalc.getPosts());

    }

    @Test
    void testCalculateAdvStatisticsPosts1000() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 10;
        int comments1 = 10;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1000, statisticsCalc.getPosts());

    }

    @Test
    void testCalculateAdvStatisticsCommentsZero() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsCalc.getComments());

    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertTrue(false);

    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertTrue(false);

    }

    @Test
    void testCalculateAdvStatisticsUsersNull() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsCalc.getUsers());

    }

    @Test
    void testCalculateAdvStatisticsUsers100() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, statisticsCalc.getUsers());


    }
}
