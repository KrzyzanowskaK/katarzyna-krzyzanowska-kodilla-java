package com.kodilla.testing.collection;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {
        System.out.println("Run testOddNumbersExterminatorEmptyList");
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> evenNumbers = numbersExterminator.exterminate(new ArrayList<Integer>());

        //Then
        Assert.assertEquals(true, evenNumbers.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList () {
        System.out.println("Run testOddNumbersExterminatorNormalList");
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> fullList = new ArrayList<Integer>();
        fullList.add(1);
        fullList.add(2);
        fullList.add(3);
        fullList.add(4);
        fullList.add(5);

        //When
        ArrayList<Integer> evenNumbers = numbersExterminator.exterminate(fullList);

        //Then
        Integer[] expectedNumbers = {2,4};
        Assert.assertArrayEquals(expectedNumbers, evenNumbers.toArray());
    }
}
