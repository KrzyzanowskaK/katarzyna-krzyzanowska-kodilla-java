package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest() {
        //Given
        String log = "Testing first log.";

        //When
        Logger.getInstance().log(log);

        //Then
        Assert.assertEquals(log, Logger.getInstance().getLastLog());
    }
}
