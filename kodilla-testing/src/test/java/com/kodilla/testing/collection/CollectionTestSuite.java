package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {System.out.println("Checking list of numbers");}

    @AfterEach
    public void after() {System.out.println("This numbers are odd");}

    @DisplayName("When create list with no values, " +
            "then one.exterminate(randomNumbers) shouldn't return no values")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> randomNumbers = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println("Size of randomNumbers list is: " + randomNumbers.size());
        System.out.println("Size of emptyList list is: " + emptyList.size());
        OddNumbersExterminator one = new OddNumbersExterminator();
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("When create list with values, " +
            "then one.exterminate(randomNumbers) should return odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(12);
        randomNumbers.add(25);
        randomNumbers.add(33);
        randomNumbers.add(99);
        randomNumbers.add(54);
        randomNumbers.add(44);

        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(12);
        oddNumbers.add(54);
        oddNumbers.add(44);
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertEquals(oddNumbers, result);
    }

}
