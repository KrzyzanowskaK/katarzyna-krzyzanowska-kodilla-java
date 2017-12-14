package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);

        //When
        shoppingTask.executeTask();
        boolean executedResult = shoppingTask.isTaskExecuted();
        String taskName = shoppingTask.getTaskName();

        //Then
        Assert.assertEquals(true, executedResult);
        Assert.assertEquals("Shopping List", taskName);
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);

        //When
        paintingTask.executeTask();
        boolean executedResult = paintingTask.isTaskExecuted();
        String taskName = paintingTask.getTaskName();

        //Then
        Assert.assertEquals(true, executedResult);
        Assert.assertEquals("Picture", taskName);
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);

        //When
        drivingTask.executeTask();
        boolean executedResult = drivingTask.isTaskExecuted();
        String taskName = drivingTask.getTaskName();

        //Then
        Assert.assertEquals(true, executedResult);
        Assert.assertEquals("Vacation", taskName);
    }
}
