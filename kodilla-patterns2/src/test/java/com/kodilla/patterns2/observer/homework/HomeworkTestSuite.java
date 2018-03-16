package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student peterParker = new Student("Peter Parker");
        Student wandaMaximoff = new Student("Wanda Maximoff");

        Mentor tonyStart = new Mentor("Tony Stark");
        Mentor bruceBanner = new Mentor("Bruce Banner");

        peterParker.registerObserver(tonyStart);
        peterParker.registerObserver(bruceBanner);
        wandaMaximoff.registerObserver(tonyStart);

        //When
        peterParker.addTask("task 1");
        peterParker.addTask("task 2");
        peterParker.addTask("task 3");
        wandaMaximoff.addTask("task 1");
        wandaMaximoff.addTask("task 2");

        //Then
        assertEquals(5, tonyStart.getUpdateCount());
        assertEquals(3, bruceBanner.getUpdateCount());
    }
}
