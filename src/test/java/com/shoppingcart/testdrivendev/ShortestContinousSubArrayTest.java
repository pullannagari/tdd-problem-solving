package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShortestContinousSubArrayTest {

    // Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order,
    // then the whole array will be sorted in ascending order.
    // Return the shortest such subarray and output its length.

    @Test
    @DisplayName("This is a base test for sub array")
    public void testShortestContinousSubArray(){
        ShortestContinousSubArray shortestContinousSubArray = new ShortestContinousSubArray();
        Assertions.assertEquals(5, shortestContinousSubArray.getShortestArray(new int[]{2,6,4,8,10,9,15}), "base case for shortest subarray");
    }

    @Test
    @DisplayName("This is a base test for sub array")
    public void testShortestContinousSubArrayTwoElements(){
        ShortestContinousSubArray shortestContinousSubArray = new ShortestContinousSubArray();
        Assertions.assertEquals(2, shortestContinousSubArray.getShortestArray(new int[]{2,1}), "base case for shortest subarray");
    }

    @Test
    @DisplayName("This is a base test for sub array")
    public void testShortestContinousSubArraySorted(){
        ShortestContinousSubArray shortestContinousSubArray = new ShortestContinousSubArray();
        Assertions.assertEquals(0, shortestContinousSubArray.getShortestArray(new int[]{1,2,3,4,5}), "base case for shortest subarray");
    }

    //[1,3,2,2,2]

    @Test
    @DisplayName("This is a base test for sub array")
    public void testShortestContinousSubArrayInterim(){
        ShortestContinousSubArray shortestContinousSubArray = new ShortestContinousSubArray();
        Assertions.assertEquals(4, shortestContinousSubArray.getShortestArray(new int[]{1,3,2,2,2}), "base case for shortest subarray");
    }
}
