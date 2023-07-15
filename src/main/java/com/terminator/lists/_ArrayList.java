package com.terminator.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class _ArrayList {
    
    /*
     *  Interface : List
     * 
     *  List(Interface) is an ordered Collection of elements which may contain duplicates.
     *  It is an interface that extends the Collection interface.
     * 
     *  Default size : 10
     */

    public static void main(String[] args) {

        declaration();

        methods();

        iteration();
        
        complementOperation();
    }

    private static void declaration() {
         // ------ Declaration ------- //

        // Using the List Interface
        List<Integer> alOne = new ArrayList<>(); // when we know the type of data
        List<Object> alTwo = new ArrayList<>();  // when we don't know the type of data
        
        // Using the ArrayList Class
        ArrayList<String> alThree = new ArrayList<>(); // when we know the type of data
        ArrayList<Object> alFour = new ArrayList<>(); // when we don't know the type of data

        // ------ List Interface Methods --------- // 

        alOne.add(39); // adding elements
        alOne.remove(0); // removing
        alOne.contains(23); // false
        alOne.isEmpty(); // false
        alOne.size(); // 0 now
        alOne.clear(); // removes all elements
        alOne.toArray(); // Convert the ArrayList to Object array ( Object[] )
        /* alOne.retainAll(Collection<? extends Integer> c); // removes all elements except c elements
           alOne.addAll(Collection<? extends Integer> c); // adds all elements of c */
    }

    private static void methods() {
        List<Integer> alOne = new ArrayList<>(); // when we know the type of data
        List<Object> alTwo = new ArrayList<>();  // when we don't know the type of data
         // ------ List Interface Methods --------- // 

        alOne.add(39); // adding elements
        alOne.remove(0); // removing
        alOne.contains(23); // false
        alOne.isEmpty(); // false
        alOne.size(); // 0 now
        alOne.clear(); // removes all elements
        alOne.toArray(); // Convert the ArrayList to Object array ( Object[] )
        /* alOne.retainAll(Collection<? extends Integer> c); // removes all elements except c elements
        alOne.addAll(Collection<? extends Integer> c); // adds all elements of c */
    
        // ------ ArrayList Interface Methods ------ // 
        alTwo.add("Itachi");
        alTwo.add("Nagato");
        alTwo.add("Yahiko");

        alTwo.get(2); // get the element on index 2 -> Yahiko
        alTwo.set(2, "Pain"); // To replace an element in the ArrayList
        System.out.println(alTwo.get(2)); // Pain
    }

    private static void iteration() {
        ArrayList<String> arrayOne = new ArrayList<>(); // when we know the type of data
        ArrayList<Object> arrayTwo = new ArrayList<>(); // when we don't know the type of data

        // ------ Iteration ------- //
        arrayOne.add("Arsenal");
        arrayOne.add("Westham");
        arrayOne.add("Liecester");
        for(int i=0; i < arrayOne.size(); i++) {
            System.out.println(String.format("Eleement at index %d -> %s", i, arrayOne.get(i)));
        }

        // or Like this (For .. each Loop)
        for(Object el : arrayOne) {
            System.out.println(String.format("Element : %s", el));
        }

        // Or like this (Iterator Interface)
        arrayTwo.add("Madrid");
        arrayTwo.add("Ajax");
        arrayTwo.add("Milan");

        Iterator<Object> it = arrayTwo.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void complementOperation() {
        ArrayList<String> arrayOne = new ArrayList<>(); 
        ArrayList<Object> arrayTwo = new ArrayList<>();

        arrayOne.add("Arsenal");
        arrayOne.add("Westham");
        arrayOne.add("Liecester");

        arrayTwo.add("Madrid");
        arrayTwo.add("Ajax");
        arrayTwo.add("Milan");

         // ---- Sorting ---- //
        // For others operations like sorting, ... we'll be using the Collections interface
        Collections.sort(arrayOne);  // to sort the array's elements
        System.out.println("Sorted : " + arrayOne); 
        Collections.sort(arrayOne, Collections.reverseOrder()); 
        System.out.println("Order reversed : " + arrayOne); 


         // ---- Shuffling ---- //
        Collections.shuffle(arrayTwo); // to shuffle the array's elements
        System.out.println("Shuffled : " + arrayTwo);
    }
}
