package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    //You are a professional robber planning to rob houses along a street.
    //Each house has a certain amount of money stashed,
    // the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
    // and it will automatically contact the police if two adjacent houses were broken into on the same night.
    //Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

    //Given an integer array nums representing the amount of money of each house,
    // return the maximum amount of money you can rob tonight without alerting the police.

    @Test
    public void testHouseRobber(){
        HouseRobber hb = new HouseRobber();
        int[] input = {1,2,3,1};
        Assertions.assertEquals(4, hb.caculateMaxMoney(input));
    }

    @Test
    public void testHouseRobberOne(){
        HouseRobber hb = new HouseRobber();
        int[] input = {2,7,9,3,1};
        Assertions.assertEquals(12, hb.caculateMaxMoney(input));
    }

    @Test
    public void testHouseRobberTwo(){
        HouseRobber hb = new HouseRobber();
        int[] input = {2,1,1,2};
        Assertions.assertEquals(4, hb.caculateMaxMoney(input));
    }
}
