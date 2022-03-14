package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheTest {
    //Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
    //
    //Implement the LRUCache class:
    //
    //LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
    //int get(int key) Return the value of the key if the key exists, otherwise return -1.
    //void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
    //The functions get and put must each run in O(1) average time complexity.

    @Test
    public void testLRUCache(){
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        lruCache.put(5, 5);
        lruCache.put(6, 6);
        Assertions.assertEquals(-1, lruCache.get(1));
        Assertions.assertEquals(5, lruCache.getCache().size());
    }

    //["LRUCache","put","get","put","get","get"]
    //[[1],[2,1],[2],[3,2],[2],[3]]
    @Test
    public void testLRUCacheOne(){
        LRUCache lruCache = new LRUCache(1);
        lruCache.put(2, 1);
        lruCache.get(2);
        lruCache.put(3, 2);
        lruCache.get(2);
        lruCache.get(3);
        Assertions.assertEquals(-1, lruCache.get(2));;
    }

    //["LRUCache","put","put","get","get","put","get","get","get"]
    //[[2],[2,1],[3,2],[3],[2],[4,3],[2],[3],[4]]
    @Test
    public void testLRUCacheTwo(){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(3, 2);
        lruCache.get(3);
        lruCache.get(2);
        lruCache.put(4, 3);
        lruCache.get(2);
        lruCache.get(3);
        lruCache.get(4);
        Assertions.assertEquals(-1, lruCache.get(2));
    }
}
