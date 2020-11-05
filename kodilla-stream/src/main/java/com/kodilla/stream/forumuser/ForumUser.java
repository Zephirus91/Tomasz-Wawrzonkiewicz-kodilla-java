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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        if (sex != forumUser.sex) return false;
        if (postsNumber != forumUser.postsNumber) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + postsNumber;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
