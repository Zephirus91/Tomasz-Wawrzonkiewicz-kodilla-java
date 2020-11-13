package com.kodilla.exception.io;
import static org.junit.jupiter.api.Assertions.*;


import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

public class ProbablyIWillThrowExceptionTestSuite {

    @Test
    void XInRangeAndYIsCorrectDontThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1));
    }

    @Test
    void XInRangeAndYIsIncorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then


    }

    @Test
    void XNotInRangeAndYIsCorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then

    }

    @Test
    void XNotInRangeAndYIsIncorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then

    }
}
