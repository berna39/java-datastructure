package com.terminator.maps;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    
    /*
    *  interface : Map<K,V>
    *  
    *  when ? :
    *      - search is important (search by key)
    *      - insertion order doesn't matter
    *      - no duplicate keys (we can also have null as a key)
    *      - underlaying datastructure : HashTable
    * 
    *      sub Interface : Entry
    *
    *   default size : 16
    *   load factor: 0.75f
    */

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();

        hm.put("Arsenal", "Gunners");
        hm.put("Tottenham", "Spurs");
        hm.put("Westham", "Hamers");
        // hm.putAll(hm); // :)
        
        System.out.println(hm);
        System.out.println(hm.containsKey("Liverpool")); // false
        System.out.println(hm.containsValue("Hamers")); // true
        
        hm.put("Liecester", "Foxes");

        hm.remove("Liecester");

        System.out.println(hm);
        System.out.println(hm.isEmpty()); // flase
        System.out.println(hm.size()); // get the size

        hm.putIfAbsent("Arsenal", "Another");

        System.out.println(hm);

        // hm.clear(); // clear the entire map

        System.out.println(hm);

        // -------- Loop -------- //
        hm.forEach((k, v) -> {
            System.out.println(String.format("the key is %s and the value is %s", k, v));
        });


        // ------ Entries methods --------- //
        System.out.println(hm.keySet()); // retrieve all keys -> Set
        System.out.println(hm.values()); // retrieve all values -> Collection<?> 
        System.out.println(hm.entrySet()); // each entry as a Map.Entry<?, ?>

        for(Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue(entry.getValue().toString().toUpperCase());
        }

        System.out.println(hm);
    }
}
