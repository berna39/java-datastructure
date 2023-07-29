package com.terminator.maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class _TreeMap {
    
    /*
    *  interface: Map<K, V>
    *  since Java 1.2 [ Legacy code ]
    *  
    *  this is a HashMap with the elements ordered using their natural ordering
    *  has the same method with the HashMap
    *
    */

    public static void main(String[] args) {
        SortedMap<String, Integer> tm = new TreeMap<>();

        tm.put("Zuena", 23);
        tm.put("Koko", 66);
        tm.put("Azia", 39);

        System.out.println(tm); // elements are sorted
    }
}
