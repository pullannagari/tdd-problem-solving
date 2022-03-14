package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingRoomIITest {
    //Given an array of meeting time intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
    //Input: intervals = [[0,30],[5,10],[15,20]]
    //Output: 2
    //Input: intervals = [[7,10],[2,4]]
    //Output: 1

    @Test
    public void testMeetingRoomsII(){
        MeetingRoomsII m2 = new MeetingRoomsII();
        int[][] input = {{0,30},{15,20},{5,10}};
        Assertions.assertEquals(2, m2.getMinMeetingRooms(input));
    }

    @Test
    public void testMeetingRoomsIIone(){
        MeetingRoomsII m2 = new MeetingRoomsII();
        int[][] input = {{7,10},{2,4}};
        Assertions.assertEquals(1, m2.getMinMeetingRooms(input));
    }

    //[[9,10],[4,9],[4,17]]
    @Test
    public void testMeetingRoomsIItwo(){
        MeetingRoomsII m2 = new MeetingRoomsII();
        int[][] input = {{9,10},{4,9},{4,17}};
        Assertions.assertEquals(2, m2.getMinMeetingRooms(input));
    }

    //[[2,11],[6,16],[11,16]]
    @Test
    public void testMeetingRoomsIIthree(){
        MeetingRoomsII m2 = new MeetingRoomsII();
        int[][] input = {{2,11},{6,16},{11,16}};
        Assertions.assertEquals(2, m2.getMinMeetingRooms(input));
    }

    //[[5,8],[6,8]]
    @Test
    public void testMeetingRoomsIIFour(){
        MeetingRoomsII m2 = new MeetingRoomsII();
        int[][] input = {{5,8},{6,8}};
        Assertions.assertEquals(2, m2.getMinMeetingRooms(input));
    }
}
