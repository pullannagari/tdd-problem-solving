package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    //Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    @Test
    public void testTrappingRainWater(){
        TrappingRainWater trw = new TrappingRainWater();
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assertions.assertEquals(6, trw.calculateTrappedWater(input));
    }

    @Test
    public void testTrappingRainWaterOne(){
        TrappingRainWater trw = new TrappingRainWater();
        int[] input = {4,2,0,3,2,5};
        Assertions.assertEquals(9, trw.calculateTrappedWater(input));
    }
}
