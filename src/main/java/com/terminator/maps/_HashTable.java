package com.terminator.maps;

import java.util.Hashtable;
import java.util.Map;

public class _HashTable {
    
    /*
    *  interface: Map<K, V>
    * 
    *  when ? : 
    *      - it's just a Thread safe HashMap<k ,v>
    *      - poor performances (due to thread safety)
    *      - doesn't accept null keys
    *      - unordered data
    */

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("country", "France");
        ht.put("region", "Haut-de-France");
        ht.put("town", "Lille");

        System.out.println(ht);

        System.out.println(ht.containsKey("country"));
        System.out.println(ht.containsValue("France"));
        System.out.println(ht.size());
        System.out.println(ht.isEmpty());
        ht.replace("country", "England");

        System.out.println(ht);
        System.out.println(ht.keySet()); // keys wrapped into a Set
        System.out.println(ht.values()); // values wrapped into a Collection<>

        // ========== Iteration ========== //
        System.out.println("======= Iteration ======");
        ht.forEach((k, v) -> {
            System.out.println(String.format("key => %s, value => %s", k, v));
        });

        System.out.println("======= Other Iteration ======");
        // or like this
        for(Map.Entry<String, String> entry : ht.entrySet())
            System.out.println(String.format("key => %s, value => %s", entry.getKey(), entry.getValue()));
    }
}
