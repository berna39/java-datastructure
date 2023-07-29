package com.terminator.sets;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang3.RandomStringUtils;

public class _TreeSet {
    
    /*
    *  Interface SortedSet<E> [ Set<E> ]
    *  Since Java 1.2 [ Legacy code ]
    * 
    *  This is a HashSet with the elements ordered using their natural ordering
    *  has the same method with the HashSet
    *
    *   Default size: 0
    *   Load factor: 100%
    *   Size growth rate: 1
    *   
    *   I.e. the default/initial size is 0, they are always 100% full, and they grow/shrink by 1 every time an element is added/removed.
    */

    public static void main(String[] args) throws InterruptedException {
        SortedSet<String> ts = new TreeSet<>();

        ts.add("tutu");
        ts.add("toto");
        ts.add("titi");
        ts.add("tete");
        ts.add("tata");

        System.out.println("current state : " + ts);

        threadSafetyTest(); //this function illustrate how the TreeSet<E> is not thread safe
        doItSafely(); // this one is safe
    }

    private static void threadSafetyTest() throws InterruptedException {
        TreeSet<String> ts = new TreeSet<>();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ts.add(RandomStringUtils.random(8, true, true));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ts.add(RandomStringUtils.random(8, true, true));
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ts.size()); // this will be changing everytime instead of being 2000
    }

    private static void doItSafely() throws InterruptedException {
        SortedSet<String> ts = Collections.synchronizedSortedSet(new TreeSet<>()); // to make it thead safe

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ts.add(RandomStringUtils.random(8, true, true));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ts.add(RandomStringUtils.random(8, true, true));
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ts.size()); // always 200
    }
}
