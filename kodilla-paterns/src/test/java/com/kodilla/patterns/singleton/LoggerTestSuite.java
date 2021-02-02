package com.kodilla.patterns.singleton;

import com.kodilla.paterns.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Last log");

        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("Last log", log);
    }
}
