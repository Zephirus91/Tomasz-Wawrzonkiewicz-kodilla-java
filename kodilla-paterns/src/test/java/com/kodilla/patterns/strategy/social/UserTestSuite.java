package com.kodilla.patterns.strategy.social;

import com.kodilla.paterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User mike = new Millenials("Mike Bravo");
        User steve = new YGeneration("Steve Chills");
        User patricia = new ZGeneration("Patricia Cruppa");

        //When
        String mikePosted = mike.sharePost();
        System.out.println("Clicking share on the Facebook: " + mikePosted);
        String stevePosted = steve.sharePost();
        System.out.println("Clicking share on the Twitter: " + stevePosted);
        String patriciaPosted = patricia.sharePost();
        System.out.println("Clicking share on the Snapchat: " + patriciaPosted);

        //Then
        assertEquals("Facebook post shared", mikePosted);
        assertEquals("Twitter post shared", stevePosted);
        assertEquals("Snapchat post shared", patriciaPosted);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User patricia = new ZGeneration("Patricia Cruppa");

        //When
        String patriciaPosted = patricia.sharePost();
        System.out.println("Patricia is clicking share: " + patriciaPosted);
        patricia.setSocialPublisher(new TwitterPublisher());
        patriciaPosted = patricia.sharePost();
        System.out.println("Patricia is clicking share now: " + patriciaPosted);

        //Then
        assertEquals("Twitter post shared", patriciaPosted);

    }
}
