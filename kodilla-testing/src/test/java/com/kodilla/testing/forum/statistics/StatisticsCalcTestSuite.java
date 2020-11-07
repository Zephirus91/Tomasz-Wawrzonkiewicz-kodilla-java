package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalcTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPostsZero() {

        //Given

        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 0;
        int comments1 = 10;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(0, statisticsCalc.getPosts());
        Assertions.assertEquals(10, statisticsCalc.getComments());
        Assertions.assertEquals(0, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsPosts1000() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 1000;
        int comments1 = 10;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(1000, statisticsCalc.getPosts());
        Assertions.assertEquals(10, statisticsCalc.getComments());
        Assertions.assertEquals(500, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(5, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsCommentsZero() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 50;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(50, statisticsCalc.getPosts());
        Assertions.assertEquals(0, statisticsCalc.getComments());
        Assertions.assertEquals(25, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 100;
        int comments1 = 50;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(100, statisticsCalc.getPosts());
        Assertions.assertEquals(50, statisticsCalc.getComments());
        Assertions.assertEquals(50, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(25, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 50;
        int comments1 = 100;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(50, statisticsCalc.getPosts());
        Assertions.assertEquals(100, statisticsCalc.getComments());
        Assertions.assertEquals(25, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(50, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(2, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsUsersNull() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        int postsCount1 = 100;
        int comments1 = 100;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statisticsCalc.getUsers());
        Assertions.assertEquals(100, statisticsCalc.getPosts());
        Assertions.assertEquals(100, statisticsCalc.getComments());
        Assertions.assertEquals(0, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(1, statisticsCalc.getCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatisticsUsers100() {

        //Given
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);
        List<String> users1 = new ArrayList<>();
        users1.add("John");
        users1.add("Jack");
        int postsCount1 = 0;
        int comments1 = 0;

        when(statisticsMock.usersNames()).thenReturn(users1);
        when(statisticsMock.postsCount()).thenReturn(postsCount1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);

        //When
        statisticsCalc.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(2, statisticsCalc.getUsers());
        Assertions.assertEquals(0, statisticsCalc.getPosts());
        Assertions.assertEquals(0, statisticsCalc.getComments());
        Assertions.assertEquals(0, statisticsCalc.getPostsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalc.getCommentsPerPost());

    }
}
