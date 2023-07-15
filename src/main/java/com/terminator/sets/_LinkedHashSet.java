package com.terminator.sets;

import java.util.LinkedHashSet;

public class _LinkedHashSet {
    
    /*
     *  Interface Set
     * 
     *  this is a HasSet with insertion order preserved
     *  has the same method with the HashSet
     *  has a hashTabe + LinkedList
     * 
     *  Initial size : 16
     *  loadFactor : 0.75
     * 
     */
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("toto");
        lhs.add("titi");
        lhs.add("tata");

        System.out.println("the current state is : " + lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Toto"));
        lhs.removeIf(e -> e.equals("tata"));
        System.out.println("the surrent state : " + lhs);

        // we can use the same iteration with HashSet
    }
}
