package com.shoppingcart.testdrivendev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsII {
    public int getMinMeetingRooms(int[][] input) {
        //Given an array of meeting time intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
        // looking at the input, the input may not be in sorted order
        // Algorithm:
        //  [[0,30],[5,10],[15,20]]
        //  sort array with the start times
        //  maintain the count variable to count the number of rooms
        //  if the start time is < max, then increment the count
//        if(input.length == 0)
//            return 0;
//        Arrays.sort(input, (a, b) -> a[0] - b[0]);
//        int count = 1;
//        int prevEnd = input[0][1];
//        int prevStart = input[0][0];
//        boolean prevMatch = false;
//        for(int i=1; i<input.length; i++){
//            if(prevStart == input[i][0]){
//                prevEnd = Math.min(prevEnd, input[i][1]);
//                prevMatch = true;
//            }
//            if(input[i][0] < prevEnd){
//                count++;
//            }
//            if(!prevMatch)
//                prevEnd = input[i][1];
//            prevStart = input[i][0];
//        }
//        return count;


        // simpler approach is that, we maintain a separate list of start times and end times in sorted order
        // we then pick the min of the two arrays to traverse and then if we pick start time, we increment the counter
        // if we end up picking the end array we decrement the counter
        // we maintain the max of count and then return the max count
        if(input.length == 1)
            return 1;
        int[] startis = new int[input.length];
        int[] endis = new int[input.length];
        for(int i=0; i<input.length; i++){
            startis[i] = input[i][0];
            endis[i] = input[i][1];
        }
        Arrays.sort(startis);
        Arrays.sort(endis);
        int si = 0, ei = 0, max = 0, count = 0;
        while(true){
            if(si == input.length || ei == input.length)
                break;
            if(startis[si] < endis[ei]){
                si++;
                count++;
            }else if(startis[si] >= endis[ei]){
                ei++;
                count--;
            }
            if(count > max)
                max = count;
        }
        return max;
    }
}
