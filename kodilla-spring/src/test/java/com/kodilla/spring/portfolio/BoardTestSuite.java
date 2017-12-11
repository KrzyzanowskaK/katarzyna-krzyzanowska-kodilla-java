package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Buy a book.";
        String taskInProgress = "Choose a book.";
        String taskDone = "Book ordered.";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assert.assertEquals("Buy a book.", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Choose a book.", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Book ordered.", board.getDoneList().getTasks().get(0));
    }
}
