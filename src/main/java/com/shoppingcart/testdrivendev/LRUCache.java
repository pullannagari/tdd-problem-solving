package com.shoppingcart.testdrivendev;

import java.util.HashMap;
import java.util.LinkedList;

//Algorithm:
// maintain a hashmap, and a linked list
// for get,
//  check if the key exists in the hashmap and return the value - update the element as the first element
// for put,
//     check if the key exists, if exists - update the value and move it to the first of the queue
//     if the key doesn't exist, check if the capacity is reached
//          if the capacity is reached, then remove the last element from the queue and then add this as the first element
//          if the capacity is not reached, add it as the first element
public class LRUCache {

    private class DlinkedNode{
        public int value;
        public DlinkedNode next;
        public DlinkedNode previous;
        public int key;

        public DlinkedNode(int key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    private class DoubleLinkedList{
        private DlinkedNode head;
        private DlinkedNode tail;
        private int nodecount;

        private void put(DlinkedNode node){
            if(nodecount == 0){
                this.tail = node;
                this.head = node;
            }else{
                if(this.tail != null){
                    this.tail.next = node;
                    node.previous = this.tail;
                }
                this.tail = node;
                node.next = null;
            }
            this.nodecount++;
        }

        private void remove(DlinkedNode node){
            if(node.key == this.head.key){
                this.head = node.next;
            }else{
                if(this.tail.key == node.key){
                    this.tail = null;
                }
                node.previous.next = node.next;
                if(node.next != null){
                    node.next.previous = node.previous;
                }

            }
            this.nodecount--;
        }

        private void moveToTail(DlinkedNode node){
            remove(node);
            put(node);
        }

        private void removeHead(){
            if(dll.nodecount > 1){
                this.head = this.head.next;
                this.head.previous = null;
            }else if(dll.nodecount == 1){
                this.head = null;
                this.tail = null;
            }
            this.nodecount--;
        }
    }

    private int capacity;

    public HashMap<Integer, DlinkedNode> getCache() {
        return cache;
    }

    HashMap<Integer, DlinkedNode> cache = new HashMap<>();

    DoubleLinkedList dll = new DoubleLinkedList();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            DlinkedNode existingNode = cache.get(key);
            existingNode.value = value;
            dll.moveToTail(cache.get(key));
        }else{
            if(dll.nodecount == capacity){
                int currHead = dll.head.key;
                dll.removeHead();
                cache.remove(currHead);
            }
            DlinkedNode node = new DlinkedNode(key, value);
            dll.put(node);
            cache.put(key, node);
        }
    }

    public int get(Integer key) {
        if(cache.containsKey(key)){
            dll.moveToTail(cache.get(key));
            return cache.get(key).value;
        }
        return -1;
    }
}
