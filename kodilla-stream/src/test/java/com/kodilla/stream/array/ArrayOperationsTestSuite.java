package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;

        //When

        //Then
        Assert.assertEquals(20, ArrayOperations.getAverage(numbers));


    }
}
