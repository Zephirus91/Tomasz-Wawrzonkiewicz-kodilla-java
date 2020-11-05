package com.kodilla.testing.forum.statistics;

public class StatisticsCalc {
    private Statistics statistics;
    private int posts;
    private int comments;
    private int users;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public StatisticsCalc(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        users = statistics.usersNames().size();
        postsPerUser = statistics.postsCount() / statistics.usersNames().size();
        commentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        commentsPerPost = statistics.commentsCount() / statistics.postsCount();
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public int getUsers() {
        return users;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
