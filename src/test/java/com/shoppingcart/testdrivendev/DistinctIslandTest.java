package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistinctIslandTest {
    //You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
    // You may assume all four edges of the grid are surrounded by water.
    //
    //An island is considered to be the same as another if and only if one island can be translated (and not rotated or reflected) to equal the other.
    //
    //Return the number of distinct islands.

    @Test
    public void testNumberOfDistinctIslands(){
        DistinctIslands dis = new DistinctIslands();
        int[][] input = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        Assertions.assertEquals(1, dis.getUniqueIslands(input));
    }

    //{{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}}
    @Test
    public void testNumberOfDistinctIslandsOne(){
        DistinctIslands dis = new DistinctIslands();
        int[][] input = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        Assertions.assertEquals(3, dis.getUniqueIslands(input));
    }
}
