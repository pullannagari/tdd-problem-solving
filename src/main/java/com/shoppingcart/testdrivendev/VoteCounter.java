package com.shoppingcart.testdrivendev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class VoteCounter {

    private HashMap<String, Integer> voterCount = new HashMap<>();

    public String getWinner(ArrayList<Vote> votes) {
        int numberOfTeams = votes.get(0).getVotestring().length();
        int[][] voteCounter = new int[26][numberOfTeams + 1];
        for(int i=0; i<26; i++){
            voteCounter[i][numberOfTeams] = 'A'+ i ;
        }
        for(Vote v: votes){
            for(int i=0; i<v.getVotestring().length(); i++){
                int currWeight = 0;
                if(this.voterCount.containsKey(v.getVoterId())){
                    if(this.voterCount.get(v.getVoterId()) == 1){
                        currWeight = 2;
                        this.voterCount.put(v.getVoterId(), 2);
                    }else if(this.voterCount.get(v.getVoterId()) == 2){
                        currWeight = 1;
                    }
                }else {
                    currWeight = 3;
                }
                voteCounter[v.getVotestring().charAt(i)-'A'][i] = voteCounter[v.getVotestring().charAt(i)-'A'][i] + currWeight;
            }
        }

        Arrays.sort(voteCounter, (a, b) -> {
            for(int i=0; i< numberOfTeams; i++){
                if(a[i] != b[i]){
                    return b[i] - a[i];
                }else if(a[i] == b[i]){
                    return a[numberOfTeams] - b[numberOfTeams];
                }
            }
            return -1;
        });

        StringBuilder result = new StringBuilder();
        for(int i=0; i<numberOfTeams; i++){
            result.append((char)voteCounter[i][numberOfTeams]);
        }
        return result.toString();
    }
}
