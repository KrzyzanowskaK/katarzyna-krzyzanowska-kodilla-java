package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenialsUser = new Millenials("Wanda Maximoff");
        User yGenerationUser = new YGeneration("Natasha Romanov");
        User zGenerationUser = new ZGeneration("Peter Parker");

        //When
        String twitterPost = millenialsUser.sharePost();
        String facebookPost = yGenerationUser.sharePost();
        String snapchatPost = zGenerationUser.sharePost();

        //Then
        Assert.assertEquals("Shared on Twitter", twitterPost);
        Assert.assertEquals("Shared on Facebook", facebookPost);
        Assert.assertEquals("Shared on Snapchat", snapchatPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenialsUser = new Millenials("Wanda Maximoff");

        //When
        millenialsUser.setSocialPublisher(new FacebookPublisher());
        String facebookPost = millenialsUser.sharePost();

        //Then
        Assert.assertEquals("Shared on Facebook", facebookPost);
    }
}
