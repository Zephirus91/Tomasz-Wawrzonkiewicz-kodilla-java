package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;

    public String getUsername() {
        username = "John Smith";
        return username;
    }
}
