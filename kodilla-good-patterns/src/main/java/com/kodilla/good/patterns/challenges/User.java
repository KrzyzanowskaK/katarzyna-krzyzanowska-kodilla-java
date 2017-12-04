package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private int userID;

    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return name + " ID Number " + userID;
    }
}
