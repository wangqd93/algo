package com.bycsmys.algo.bytedance;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * leetcode 146
 * LRU 缓存
 */
public class LRU_146 {

    private int cap;

    private Map<Integer,Integer> map = new LinkedHashMap<>();

    public LRU_146(int capacity) {
        this.cap = capacity;

    }

    public int get(int key) {
        if(map.get(key) == null){
            return -1;
        }

        int value = map.get(key);
        map.remove(key);
        map.put(key,value);
        return value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
            return;
        }

        if(map.size() < cap){
            map.put(key,value);
            return;
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        iterator.next();
        iterator.remove();

        map.put(key, value);

    }
}
