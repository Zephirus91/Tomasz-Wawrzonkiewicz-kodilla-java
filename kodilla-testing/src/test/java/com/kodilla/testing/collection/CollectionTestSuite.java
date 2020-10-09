package com.kodilla.testing.collection;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {System.out.println("Test begin");}

    @AfterEach
    public void after() {System.out.println("Test end");}

    @DisplayName("When create list with no values, " +
            "then one.exterminate(randomNumbers) shouldn't return no values")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> randomNumbers = new ArrayList<>();
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertEquals(null, result);
    }

    @DisplayName("When create list with values, " +
            "then one.exterminate(randomNumbers) should return odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(12);
        randomNumbers.add(25);
        randomNumbers.add(33);
        randomNumbers.add(99);
        randomNumbers.add(54);
        randomNumbers.add(44);
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertArrayEquals([12, 54,44], result);
    }
}
