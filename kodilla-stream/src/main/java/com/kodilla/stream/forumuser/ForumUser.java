package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(final int userId, final String userName, final char sex, LocalDate birthDate, final int postsNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.postsNumber = postsNumber;
        this.birthDate = birthDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "User ID number: " + userId + ". User Name: " + userName +
                ". Sex: " + sex + ". Posts number: " + postsNumber;
    }
}
