package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PivotIndexTest {
    //Given an array of integers nums, calculate the pivot index of this array.
    //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
    //If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
    //This also applies to the right edge of the array.
    //Return the leftmost pivot index. If no such index exists, return -1.

    @Test
    public void testPivotIndex(){
        PivotIndex pi = new PivotIndex();
        int[] input = {1,7,3,6,5,6};
        Assertions.assertEquals(3, pi.findPivotIndex(input));
    }

    @Test
    public void testPivotIndexOne(){
        PivotIndex pi = new PivotIndex();
        int[] input = {1,2,3};
        Assertions.assertEquals(-1, pi.findPivotIndex(input));
    }

    @Test
    public void testPivotIndexTwo(){
        PivotIndex pi = new PivotIndex();
        int[] input = {2,1,-1};
        Assertions.assertEquals(0, pi.findPivotIndex(input));
    }

    @Test
    public void testPivotIndexThree(){
        PivotIndex pi = new PivotIndex();
        int[] input = {-1,1,2};
        Assertions.assertEquals(2, pi.findPivotIndex(input));
    }
}
