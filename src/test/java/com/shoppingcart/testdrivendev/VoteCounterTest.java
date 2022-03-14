package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class VoteCounterTest {
    // Question 1
    // write a program to calculate the winner based on the votes
    // given a method which accept a list of votes
    // each person can vote 3 times with the following weight
    // first vote has weight 3
    // second vote has weight 2
    // third vote has weight 1

    @Test
    public void testCountVotesBasic(){
        VoteCounter voteCounter = new VoteCounter();
        Vote v1 = new Vote("abc", "ABC");
        Vote v2 = new Vote("abc", "ACB");
        Vote v3 = new Vote("def", "CAB");
        ArrayList<Vote> votes = new ArrayList<>();
        votes.add(v1);
        votes.add(v2);
        votes.add(v3);
        Assertions.assertEquals("ACB", voteCounter.getWinner(votes), "basic test case");
    }

    @Test
    public void testCountVotesSameVotes(){
        VoteCounter voteCounter = new VoteCounter();
        Vote v1 = new Vote("abc", "ABC");
        Vote v2 = new Vote("dba", "CAB");
        Vote v3 = new Vote("def", "BCA");
        ArrayList<Vote> votes = new ArrayList<>();
        votes.add(v1);
        votes.add(v2);
        votes.add(v3);
        Assertions.assertEquals("ABC", voteCounter.getWinner(votes), "basic test case");
    }

    @Test
    public void testCountVotesBase2(){
        VoteCounter voteCounter = new VoteCounter();
        Vote v1 = new Vote("abc", "BCA");
        Vote v2 = new Vote("abc", "CAB");
        Vote v3 = new Vote("def", "BAC");
        ArrayList<Vote> votes = new ArrayList<>();
        votes.add(v1);
        votes.add(v2);
        votes.add(v3);
        Assertions.assertEquals("BCA", voteCounter.getWinner(votes), "basic test case");
    }
}
