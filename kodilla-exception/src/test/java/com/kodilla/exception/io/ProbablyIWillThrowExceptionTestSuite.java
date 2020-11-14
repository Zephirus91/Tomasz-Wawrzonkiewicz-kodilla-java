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
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.49));
    }

    @Test
    void XInRangeAndYIsIncorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99, 1.5))
        );
    }

    @Test
    void XNotInRangeAndYIsCorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.49)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.51))
        );
    }

    @Test
    void XNotInRangeAndYIsIncorrectThrowException() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5))
        );
    }
}
