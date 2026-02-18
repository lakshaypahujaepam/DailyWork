package com.lakshay;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    private class Node {
        K key;
        V value;
        MyHashMap next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    Node bucket[16];
//    private final int n = 16;

//    MyHashMap() {
//         bucket = new Node[n];
//    }

    byte getIndex(K key) {
        return (byte) Math.abs(key.hashCode() % bucket.length);
    }

//    boolean put(K key,V value) {
//        if(bucket.get(getIndex(key) ) {
//            bucket.add(getIndex(key),new Node(key, value));
//        }
//        return false;
//    }

//    V get(K key) {
//        return new V();
//    }
}
