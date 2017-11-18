package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

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


        //When


        //Then

    }
}
