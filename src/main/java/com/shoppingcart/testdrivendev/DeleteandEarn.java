package com.shoppingcart.testdrivendev;

import java.util.*;

public class DeleteandEarn {

//    Algorithm:
//    Need max points
//    maintain max points counter
//    start by taking the first element as our n
//    then calculate the further points by recursively calling the next with the remainder of the list
//    maintain the points in a counteratindex, and check if it is greater than the max so far and replace

    HashMap<Integer, Integer> intCounter = new HashMap<>();
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int deleteAndEarn(int[] input) {
//        int maxPoints = 0;
//        for(int i=0; i< input.size(); i++){
//            int counter = 0;
//            ArrayList<Integer> copyin = new ArrayList<>();
//            copyin.addAll(input);
//            int counteratindex = calculatePointsAtIndex(i, counter, copyin);
//            System.out.println(counteratindex);
//            if(counteratindex > maxPoints)
//                maxPoints = counter;
//        }
//        return maxPoints;

        // make a map of counter
        // sort the unique numbers
        // check the max of picking the current element based on the counter
        //
        // or picking the next to next  and so on until the end of the list
        for(int i=0; i<input.length; i++){
            if(intCounter.containsKey(input[i])) {
                intCounter.put(input[i], intCounter.get(input[i]) + 1);
            }else{
                intCounter.put(input[i], 1);
            }
        }
        ArrayList<Integer> uniques = new ArrayList<>(intCounter.keySet());
        Collections.sort(uniques);
        int maxPoints = 0;
        for(int i=0; i<uniques.size(); i++){
            int currPoints = calcPointsAtCurrent(i, uniques);
            if( currPoints > maxPoints) maxPoints = currPoints;
            cache.clear();
        }

        return maxPoints;
    }

    private int calcPointsAtCurrent(int i, ArrayList<Integer> uniques) {
        if (i >= uniques.size()) return 0;
        if(cache.containsKey(i))
            return cache.get(i);
        else{
            int retVal = 0;
            if (i+1 < uniques.size() && uniques.get(i + 1) > uniques.get(i) + 1) {
                retVal = intCounter.get(uniques.get(i)) * uniques.get(i) + Math.max(calcPointsAtCurrent(i + 1, uniques), calcPointsAtCurrent(i + 1, uniques));
            }else{
                System.out.println("in two"+i);
                retVal = intCounter.get(uniques.get(i)) * uniques.get(i) + Math.max(calcPointsAtCurrent(i + 2, uniques), calcPointsAtCurrent(i + 3, uniques));
            }
            cache.put(i, retVal);
            //System.out.println(retVal);
            return retVal;
        }
    }


//    private int calculatePointsAtIndex(int currPos, int counter, ArrayList<Integer> input) {
//        if(input.size() < 1 || currPos >= input.size())
//            return 0;
//        counter += input.get(currPos);
//        int low = input.get(currPos) -1;
//        int high = input.get(currPos) +1;
//        input.remove(currPos);
//        int i = 0;
//        while(i < input.size()){
//            if(input.get(i) == low || input.get(i) == high)
//                input.remove(i);
//            i++;
//        }
//        return calculatePointsAtIndex(currPos++, counter, input);
//    }
}
