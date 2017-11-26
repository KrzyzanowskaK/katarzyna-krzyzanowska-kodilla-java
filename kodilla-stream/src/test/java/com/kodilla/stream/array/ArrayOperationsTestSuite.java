package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int sum=0;
        int[] elements = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i=0; i<20; i++) {
            sum=sum+elements[i];
        };

        //When
        double average = sum/elements.length;

        //Then
        Assert.assertEquals(average, ArrayOperations.getAverage(elements),0);

    }
}