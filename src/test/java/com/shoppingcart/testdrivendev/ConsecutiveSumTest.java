package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsecutiveSumTest {
    // Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.

    @Test
    public void testConsecutiveSum(){
        // given n, should be represented as the sum of consecutive integers which are less than n
        ConsecutiveSum csum = new ConsecutiveSum();
        Assertions.assertEquals(1, csum.getConseciveSumCount(2));
    }
}
