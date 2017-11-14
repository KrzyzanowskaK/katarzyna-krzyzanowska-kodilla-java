package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

public class CollectionTestSuite {

    public static void main(String[] args) {

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
            //Given
            OddNumbersExterminator numbersEven = new OddNumbersExterminator();
            OddNumbersExterminator emptyList = new OddNumbersExterminator();

            //When
            OddNumbersExterminator fullList = numbersEven.exterminate());
            System.out.println(emptyList);

            //Then
            Assert.assertEquals(emptyList,fullList);

        }

        @Test
        public void testOddNumbersExterminatorNormalList () {
            //Given
            OddNumbersExterminator numbersEven = new OddNumbersExterminator();

            //When
            OddNumbersExterminator fullList = numbersEven.exterminate());

            //Then
            Assert.assertEquals(numbersEven,numbersEven(1,2,3,4));

        }
    }
}
