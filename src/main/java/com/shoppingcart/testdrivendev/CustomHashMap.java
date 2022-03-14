package com.shoppingcart.testdrivendev;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;

public class CustomHashMap<K,V> {

    ArrayList<Pair<K,V>>[] map = new ArrayList[10];

    public void put(K key, V value) {
        if(map[generateHash(key)] != null){
            ArrayList<Pair<K, V>> currEntry = map[generateHash(key)];
            for(int i=0; i< currEntry.size(); i++){
                Pair<K, V> node = currEntry.get(i);
                if(node.fst == key){
                    currEntry.remove(node);
                    node = new Pair<>(key, value);
                    currEntry.add(node);
                    return;
                }
            }
            Pair<K, V>  node = new Pair<>(key, value);
            currEntry.add(node);
        }else{
            ArrayList<Pair<K, V>> currEntry = new ArrayList<>();
            Pair<K, V> pair = new Pair<>(key, value);
            currEntry.add(pair);
            map[generateHash(key)] = currEntry;
        }
    }

    public V get(K key) {
        if(map[generateHash(key)] != null){
            ArrayList<Pair<K, V>> currEntry = map[generateHash(key)];
            for(int i=0; i<currEntry.size(); i++){
                if(currEntry.get(i).fst == key)
                    return currEntry.get(i).snd;
            }
        }
        return null;
    }

    private int generateHash(K key){
        int hash = 0;
        for(int i=0; i<key.toString().length(); i++){
            hash += key.toString().charAt(i);
        }
        return hash%10;
    }
}
