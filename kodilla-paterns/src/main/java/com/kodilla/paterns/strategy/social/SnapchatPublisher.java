package com.kodilla.paterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Snapchat post shared";
    }
}
