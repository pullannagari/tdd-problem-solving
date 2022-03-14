package com.shoppingcart.testdrivendev;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DistinctIslands {

    //Algorithm:
    //start at the index 0,0. if the value at this position is 1, then add it to the island hashmap
    //l

    boolean[][] visited;
    //HashSet<Pair<Integer,Integer>> island = new HashSet<>();
    String currisland = "";
    private int currX;
    private int currY;

    public int getUniqueIslands(int[][] grid) {
        //Set<Set<Pair<Integer, Integer>>> uniqueIslands = new HashSet<>();
        HashSet<String> uniques = new HashSet<>();
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[i].length; j++){
                currX = i;
                currY = j;
                checkIslandAt(grid, i, j);
                if(currisland != "")
                    uniques.add(currisland);
                //island = new HashSet<>();
                currisland = "";
            }
        }

        return uniques.size();
    }

    private void checkIslandAt(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length) return;
        if(grid[i][j] == 0 || visited[i][j]) return;
        if(grid[i][j] == 1){
            visited[i][j] = true;
            int x = (i - currX);
            int y = (j - currY);
            currisland += x+""+y;
            System.out.println(currisland);
            //Pair<Integer,Integer> currIndexes = new Pair<>(i - currX, j - currY);
            //island.add(currIndexes);
        }
        checkIslandAt(grid, i+1, j);
        checkIslandAt(grid, i-1, j);
        checkIslandAt(grid, i, j+1);
        checkIslandAt(grid, i, j-1);

        ArrayList<Pair<Object, Object>>[] map = new ArrayList[10];
    }
}
