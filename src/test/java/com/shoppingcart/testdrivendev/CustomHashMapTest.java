package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomHashMapTest {
    //implement a hash map
    @Test
    public void testCustomHashMap(){
        CustomHashMap chm = new CustomHashMap();
        chm.put(1, 10);
        chm.put(6, 20);
        Assertions.assertEquals(20, chm.get(6));
    }

    @Test
    public void testCustomHashMapOne(){
        CustomHashMap chm = new CustomHashMap();
        chm.put(1, 10);
        chm.put(6, 20);
        chm.put(1, 1);
        chm.put(6, 30);
        Assertions.assertEquals(30, chm.get(6));
    }

    @Test
    public void testCustomHashMapTwo(){
        CustomHashMap chm = new CustomHashMap();
        chm.put(1, 10);
        chm.put(5, 20);
        Assertions.assertEquals(null, chm.get(6));
    }
}
