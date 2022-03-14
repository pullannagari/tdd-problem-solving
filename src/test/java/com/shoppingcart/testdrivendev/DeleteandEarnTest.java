package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DeleteandEarnTest {
    //You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

    //Pick any nums[i] and delete it to earn nums[i] points.
    // Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.

    //Return the maximum number of points you can earn by applying the above operation some number of times.

    @Test
    public void testDeleteandEarn(){
        DeleteandEarn dne = new DeleteandEarn();
        int[] input = {2, 3, 4};
        Assertions.assertEquals(6, dne.deleteAndEarn(input));
    }

    @Test
    public void testDeleteandEarnOne(){
        DeleteandEarn dne = new DeleteandEarn();
        int[] input = {2,2,3,3,3,4};
        Assertions.assertEquals(9, dne.deleteAndEarn(input));
    }

    //[1,1,1,2,4,5,5,5,6]
    @Test
    public void testDeleteandEarnTwo(){
        DeleteandEarn dne = new DeleteandEarn();
        int[] input = {1,1,1,2,4,5,5,5,6};
        Assertions.assertEquals(18, dne.deleteAndEarn(input));
    }


}
