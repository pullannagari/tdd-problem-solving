package com.shoppingcart.testdrivendev;

import java.util.HashMap;

public class HouseRobber {
    //we need to find the max of starting the robbery by selecting the house n v/s n-1
    //if we select the n, then the next house he can select would be n-2
    //if we select n-1, then the next house he can select would be n-3
    //calculate the counts in both the cases and return the max of both

    HashMap<Integer, Integer> cache = new HashMap<>();

    public int caculateMaxMoney(int[] input) {
        int n = input.length-1;
        int money = Math.max(calculateMoney(input, n), calculateMoney(input, n-1));
        return money;
    }

    private int calculateMoney(int[] input, int n) {
        if(n<0) return 0;
        if(cache.containsKey(n))
            return cache.get(n);
        else{
            cache.put(n-2, calculateMoney(input, n-2));
            cache.put(n-3, calculateMoney(input, n-3));
            return input[n] + Math.max(cache.get(n-2), cache.get(n-3));
        }
    }
}
