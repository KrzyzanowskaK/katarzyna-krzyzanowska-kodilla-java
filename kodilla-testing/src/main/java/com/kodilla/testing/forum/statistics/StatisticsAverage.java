package com.kodilla.testing.forum.statistics;

public class StatisticsAverage {
    private int userNumber;
    private int commentNumber;
    private int postNumber;
    private double averagePostUser;
    private double averageCommentUser;
    private double averageCommentPost;

    public int getUserNumber() {
        return userNumber;
    }
    public int getCommentNumber() {
        return commentNumber;
    }
    public int getPostNumber() {
        return postNumber;
    }
    public double getAveragePostUser() {
        return averagePostUser;
    }
    public double getAverageCommentUser() {
        return averageCommentUser;
    }
    public double getAverageCommentPost() {
        return averageCommentPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.userNumber = statistics.usersNames().size();
        this.commentNumber = statistics.commentsCount();
        this.postNumber = statistics.postsCount();

        this.averagePostUser = postNumber / userNumber;
        this.averageCommentUser = commentNumber / userNumber;
        this.averageCommentPost = commentNumber / postNumber;
    }

    public void ShowStatistics() {

    }
}
