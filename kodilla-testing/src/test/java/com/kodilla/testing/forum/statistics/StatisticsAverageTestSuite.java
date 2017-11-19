package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsAverageTestSuite {

    @Test
    public void testCalculateAdvStatisticsWhen0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsAverage.getPostNumber());
    }

    @Test
    public void testCalculatedAdvStatisticsWhen1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, statisticsAverage.getPostNumber());
    }

    @Test
    public void testCalculatedAdvStatisticsWhen0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsAverage.getCommentNumber());
    }

    @Test
    public void testCalculatedAdvStatisticsWhenLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsAverage.getCommentNumber() < statisticsAverage.getPostNumber());
    }

    @Test
    public  void testCalculatedAdvStatisticsWhenMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticsAverage.getCommentNumber() > statisticsAverage.getPostNumber());
    }

    @Test
    public void testCalculatedAdvStatisticsWhen0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,statisticsAverage.getUserNumber());
    }

    @Test
    public void testCalculatedAdvStatisticsWhen100Users () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        for(int i=0; i<100; i++){
            userList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsAverage statisticsAverage = new StatisticsAverage();

        //When
        statisticsAverage.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100,statisticsAverage.getUserNumber());
    }
}