package com.kodilla.paterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook post shared";
    }


}
