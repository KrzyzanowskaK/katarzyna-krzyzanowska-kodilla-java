package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> numbersEven = new ArrayList<Integer>();

        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbersEven.add(numbers.get(i));
            }
        }
        return numbersEven;
    }
}
