package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountUniqueCharsTest {
    //Let's define a function countUniqueChars(s) that returns the number of unique characters on s.
    //
    //For example if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
    //Given a string s, return the sum of countUniqueChars(t) where t is a substring of s.
    //
    //Notice that some substrings can be repeated so in this case you have to count the repeated ones too.

    @Test
    public void testCountUniqueChars(){
        CountUniqueChars cuc = new CountUniqueChars();
        Assertions.assertEquals(10, cuc.uniqueLetterString("ABC"));
    }

    @Test
    public void testCountUniqueCharsOne(){
        CountUniqueChars cuc = new CountUniqueChars();
        Assertions.assertEquals(8, cuc.uniqueLetterString("ABA"));
    }

    @Test
    public void testCountUniqueCharsTwo(){
        CountUniqueChars cuc = new CountUniqueChars();
        Assertions.assertEquals(92, cuc.uniqueLetterString("LEETCODE"));
    }
}
