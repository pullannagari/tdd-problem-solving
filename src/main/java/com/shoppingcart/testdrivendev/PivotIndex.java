package com.shoppingcart.testdrivendev;

public class PivotIndex {

    //in the brute force way, we can find the sum of all the elements in the first step
    //in the second iteration starting from the left, maintain the sum of the left elements
    //if at some index totalSum - leftSum == 0, then the answer would be that index

    public int findPivotIndex(int[] input) {
        int totalSum = 0;
        for(int i=0; i< input.length; i++){
            totalSum += input[i];
        }
        int leftSum = 0;
        for(int i=0; i<input.length; i++){
            System.out.println(totalSum+" "+leftSum);
            if(totalSum - input[i] - leftSum == leftSum)
                return i;
            leftSum += input[i];
        }
        return -1;
    }
}
