package com.shoppingcart.testdrivendev;

public class TrappingRainWater {

    public int calculateTrappedWater(int[] input) {
        //input is a list of integers representing the height of the bar
        //width is 1
        //need to calculate the water stored

        //Algorithm:
        //start with the first entry as the first and the next as the high second
        //if the first is greater than the second - then quantity would be key-two * index(key-two) * index(key-one) - minus heights between the second and first
        //move to the next as low and the next to next as the high
        //if the second is low - then track it in the minus heights list
//        int first = 0, second = 1;
//        int negateBars = 0;
//        int trappedWater = 0;
//        while(second < input.length && second > first){
//            if(input[second] < input[first]){
//                negateBars += input[second];
//                second++;
//            }else if(input[second] >= input[first]){
//                trappedWater = (second - first -1) * input[first] - negateBars;
//                first = second;
//                second = second + 1;
//            }
//            System.out.println(trappedWater);
//        }
//        return trappedWater;


        //working Algorithm:
        //two pointer approach:
        // maintain leftMax and rightMax as input[0] and input[input.length-1]
        // start with left as 1 and right as input.length-2
        // if left < right,  left >= leftMax, then there cannot be any water - make leftMax as current left
        // else if left is less then, add the current water as leftMax-left
        // do the same for the right
        int length = input.length;
        if(length < 2)  return 0;
        int trappedWater = 0;
        int leftMax = 0;
        int left = 0;
        int rightMax = 0;
        int right = length-1;
        while(left < right){
            if(input[left] < input[right]){
                if(input[left] >= leftMax){
                    leftMax = input[left];
                }else{
                    trappedWater += (leftMax - input[left]);
                }
                left++;
            }else{
                if(input[right] >= rightMax){
                    rightMax = input[right];
                }else{
                    trappedWater += (rightMax - input[right]);
                }
                right--;
            }
        }
        return trappedWater;
    }
}
