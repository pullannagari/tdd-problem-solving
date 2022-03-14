package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HighFiveTest {

    //Given a list of the scores of different students, items, where items{i} = {IDi, scorei} represents one score from a student with IDi, calculate each student's top five average.
    //Return the answer as an array of pairs result, where result{j} = {IDj, topFiveAveragej} represents the student with IDj and their top five average. Sort result by IDj in increasing order.
    //A student's top five average is calculated by taking the sum of their top five scores and dividing it by 5 using integer division.

    // top 5 average - need to use priority queue?
    // Algorithm:
    // 1. iterate through the list, and find all the scores of a particular id
    // 2. for each entry, insert the values into a priority queue
    // 4. pop the top 5 and take the avg of each entry
    // 5. prep the output

    @Test
    public void testHighFive(){
        Integer[][] input = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        HighFive hf = new HighFive();
        Integer[][] output = {{1,87},{2,88}};
        Assertions.assertEquals(output, hf.findTheHighFive(input));
    }
}
