package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {

    private final List<ForumUser> userForumsList = new ArrayList<>();

    public Forum(){
        userForumsList.add(new ForumUser(1, "user1", 'M', 1999, 1, 1, 10));
        userForumsList.add(new ForumUser(2, "user2", 'M', 1989, 1, 1, 0));
        userForumsList.add(new ForumUser(3, "user3", 'F', 1979, 1, 1, 5));
        userForumsList.add(new ForumUser(4, "user4", 'F', 1969, 1, 1, 15));
        userForumsList.add(new ForumUser(5, "user5", 'M', 1959, 1, 1, 0));
        userForumsList.add(new ForumUser(6, "user6", 'M', 1949, 1, 1, 20));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(userForumsList);
    }
}