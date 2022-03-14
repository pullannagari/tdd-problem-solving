package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;

public class LRUUsingLinkedHashMapTest {
    public void testLRUCache(){
        LRUUsingLinkedHashMap lruCache = new LRUUsingLinkedHashMap(2);
        lruCache.put(2, 1);
        lruCache.put(3, 2);
        lruCache.get(3);
        lruCache.get(2);
        lruCache.put(4, 3);
        lruCache.get(2);
        lruCache.get(3);
        lruCache.get(4);
        Assertions.assertEquals(-1, lruCache.get(2));;
    }
}
