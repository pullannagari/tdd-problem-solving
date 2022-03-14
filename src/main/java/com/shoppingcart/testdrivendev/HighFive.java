package com.shoppingcart.testdrivendev;

import java.util.*;

public class HighFive {

    public int[][] findTheHighFive(Integer[][] input) {
        HashMap<Integer, ArrayList<Integer>> groupedScores = new HashMap<>();
        for(int i = 0; i < input.length; i++){
            if(groupedScores.containsKey(input[i][0])){
                ArrayList<Integer> scores = groupedScores.get(input[i][0]);
                scores.add(input[i][1]);
            }else{
                ArrayList<Integer> scores = new ArrayList<>();
                scores.add(input[i][1]);
                groupedScores.put(input[i][0], scores);
            }
        }

        int[][] result = new int[groupedScores.keySet().size()][2];
        int count = 0;
        for(int id: groupedScores.keySet()){
            ArrayList<Integer> scores = groupedScores.get(id);
            PriorityQueue<Integer> scoresQueue = new PriorityQueue<>(10, Collections.reverseOrder());
            for(int score: scores){
                scoresQueue.add(score);
            }
            int scoresSum = 0;
            for(int i=0; i<5;i++){
                scoresSum += scoresQueue.poll();
            }
            result[count] = new int[]{id, scoresSum / 5};
        }
        return result;
    }
}
