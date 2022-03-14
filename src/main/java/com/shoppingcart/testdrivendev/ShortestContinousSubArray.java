package com.shoppingcart.testdrivendev;

public class ShortestContinousSubArray {

    // This is a two pointer approach
    // start at the start of the array and check the last index where there is a decrement
    // start the other pointer at the end of the array and then move towards the start of the array to find the other first index where there is increment

    public int getShortestArray(int[] inputArray) {
        int endIndex = -2, startIndex = -1, min = inputArray[inputArray.length-1], max = inputArray[0];
        for(int i=1; i < inputArray.length; i++){
            max = Math.max(max, inputArray[i]);
            min = Math.min(min, inputArray[inputArray.length-i-1]);
            if(max > inputArray[i]){
                endIndex = i ;
            }
            if(min < inputArray[inputArray.length-i-1]){
                startIndex = inputArray.length-i-1;
            }
        }
        return endIndex - startIndex +1;
    }
}
