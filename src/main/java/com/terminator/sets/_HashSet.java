package com.terminator.sets;

import java.util.HashSet;
import java.util.Iterator;

public class _HashSet {

    /*
     *  Interface : Set
     * 
     *  we need a Hashet when:
     *      - we don't want duplicate data
     *      - we can store all type of data
     *      - we don't care about inserting order
     *      - we don't need to use indexes (we'll be using hashcode to search elements)
     *      - we cannot sort or shuffle elements because we don't have indexes
     *      
     * 
     *  Initial size : 16
     * 
     *  Default load factor or fill ration : 0.75
     *  
     *  by default when we create a HashSet, it has a capacity of 16, when we fill data at 75% (the fill ratio), 
     *  it will create a bigger
     *  element and copy the current content into it...and the old will be cleared by the garbage collector
     *  
     *  NOTE: the HashSet doesn't have it's own specifics methods, it implements all the Collection method
     * 
     *  IMPORTANT: The important thing about HashSet<T> is right there in the name: it's a SET. The only things 
     *  you can do with a single set is to establish what its members are, and to check whether an item is a member.
        Asking if you can retrieve a single element (e.g. set[45]) is misunderstanding the concept of the set. 
        There's no such thing as the 45th element of a set. Items in a set have no ordering. The sets {1, 2, 3} 
        and {2, 3, 1} are identical in every respect because they have the same membership, and membership is all 
        that matters.
     */
    
    public static void main(String[] args) {
        basics();
        iteration();
    }

    private static void basics() {
         HashSet<String> hs = new HashSet<>();
        // HashSet<String> hs = new HashSet<>(100, (float) 0.90); // declaration with initial capacity and load factor 

        hs.add("Toto");
        hs.add("Titi");
        hs.add("Tata");
        hs.add("Tutu");
        hs.add("Tete");

        System.out.println("the current state is : " + hs);

        hs.add("Toto"); // :)

        System.out.println("the current state is : " + hs);

        // methods
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs.contains("Toto"));

        hs.remove("Tete");

        System.out.println("the current state is : " + hs);
    }

    private static void iteration() {
        // using for...each loop
        HashSet<String> hs = new HashSet<>();
        // HashSet<String> hs = new HashSet<>(100, (float) 0.90); // declaration with initial capacity and load factor 

        hs.add("Toto");
        hs.add("Titi");
        hs.add("Tata");
        hs.add("Tutu");

        System.out.println("==== using for..each loop ===");
        for(String el : hs)
            System.out.println(el);

        System.out.println("==== iterator ===");
        Iterator<String> it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
