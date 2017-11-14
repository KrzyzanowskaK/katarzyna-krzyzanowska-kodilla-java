package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

        ArrayList<Integer> numbersEven = new ArrayList<Integer>(10);

        public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

            for (int i=0; i<numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    numbersEven.add(numbers.get(i));
                }
            }
            return numbersEven;
        }
}
