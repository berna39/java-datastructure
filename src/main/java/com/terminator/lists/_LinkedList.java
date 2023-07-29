package com.terminator.lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class _LinkedList {

    /*
    *  Interface : List & Queue
    *  
    * This data structure need to be used when :  
    *      - we don't have many retrieving operations
    *      - we have many adding and deleting operation
    * 
    */
    
    public static void main(String[] args) {
        
        basics();

        iteration();

        operations();

    }

    private static void basics() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Toto");
        ll.add("Titi");
        ll.add("Tata");

        System.out.println("the linked list state is : " + ll);
        System.out.println("the size of the linked list is : " + ll.size());
        System.out.println(ll.get(0)); // retrieving using Index

        ll.add(2, "Tete");
        
        System.out.println(ll.getFirst()); // retrieving first element
        System.out.println(ll.getLast()); // retrieving last element

        ll.addFirst("First"); // adding a node at the begining

        System.out.println("the linked list state is : " + ll);

        ll.addLast("Last"); // adding a node at the end

        System.out.println("the linked list state is : " + ll);

        ll.remove(1); // removing element using index

        System.out.println("the linked list state is : " + ll);

        ll.removeFirst(); // removing first element

        System.out.println("the linked list state is : " + ll);

        ll.removeLast(); // removing last element

        System.out.println("the linked list state is : " + ll);

        ll.removeIf(e -> e.contains("Ta")); // removing using a predicate

        System.out.println("the linked list state is : " + ll);

        System.out.println(ll.isEmpty()); // false

        System.out.println(ll.contains("Tete")); // true
    }

    private static void iteration() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Toto");
        ll.add("Titi");
        ll.add("Tata");

        // for loop
        System.out.println(" ===== using for loop ====");
        for (int i = 0; i < ll.size(); i++)
            System.out.println(ll.get(i));

        // for..each loop
        System.out.println(" ===== using for...each loop ====");
        for(String el : ll)
            System.out.println(el);

        System.out.println("==== using iteration ====");
        Iterator<String> it = ll.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }


    private static void operations() {
         // Other operations
        LinkedList<Integer> anotherLl = new LinkedList<>();
        anotherLl.add(16);
        anotherLl.add(19);
        anotherLl.add(39);
        anotherLl.add(3);

        System.out.println(anotherLl);

        Collections.sort(anotherLl); // sorting elements

        System.out.println(anotherLl);

        Collections.shuffle(anotherLl); // shuffling elements

        System.out.println(anotherLl);
    }
}
