package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                filtered.add(number);
            }
        }
        return filtered;
    }
}

class Filter {
    public static void main (String[] args) {

    OddNumbersExterminator one = new OddNumbersExterminator();
    List<Integer> randomNumbers = new ArrayList<>();

    randomNumbers.add(12);
    randomNumbers.add(25);
    randomNumbers.add(33);
    randomNumbers.add(99);
    randomNumbers.add(54);
    randomNumbers.add(44);
    
    System.out.println(one.exterminate(randomNumbers));
    }
}