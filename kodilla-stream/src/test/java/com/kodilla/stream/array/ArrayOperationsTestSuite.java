package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[41];
        numbers[0] = 0;
        numbers[10] = 10;
        numbers[20] = 20;
        numbers[30] = 30;
        numbers[40] = 40;

        //When

        //Then
        Assert.assertEquals(20, ArrayOperations.getAverage(numbers), 0.1);



    }
}
