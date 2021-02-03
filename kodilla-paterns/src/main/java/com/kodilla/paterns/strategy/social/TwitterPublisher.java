package com.kodilla.paterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Twitter post shared";
    }
}
