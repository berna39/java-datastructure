package com.terminator.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class _Vectors {
    
    /*
    *   Interface : List [ was in the legacy version of Java ]
    *   when ? :
    *      - It's a ThreadSafe ArrayList (Poor performance)
    * 
    *   Note: If you want to know more about Thread safety got to the threads.ThreadSafety.java file
    *
    *   Initial Capacity:10
    *   Load Factor:1 (when the list is full)
    *   Growth Rate: current_size * 2 (if capacityIncrement is not defined) current_size + capacityIncrement 
    *   (if capacityIncrement is defined during vector initialization)
    *  
    */

    public static void main(String[] args) {
        // Performances
        listPerformanceTest();
        vectorPerformanceTest(); // this takes a bit longer to execute because Vector<?> is thread safe

        Vector<String> vec = new Vector<>();
        vec.add("toto");
        vec.add("titi");
        vec.add("tete");
        vec.add("tutu");

        System.out.println(vec.size());
        System.out.println(vec.get(1));
        System.out.println(vec.isEmpty());

        vec.remove(2);
        vec.removeAllElements();
        System.out.println("the current state is : " + vec);
    }

    private static void listPerformanceTest() {
        List<Integer> li = new ArrayList<>();
        long start = System.currentTimeMillis();

        for(int i=1; i <= 1000000; i++ )
            li.add(i);

        long end = System.currentTimeMillis();
        System.out.println(String.format("List benchMark report : %dms", end - start));
    }

    private static void vectorPerformanceTest() {
        Vector<Integer> vec = new Vector<>();
        long start = System.currentTimeMillis();

        for(int i=1; i <= 1000000; i++ )
            vec.add(i);

        long end = System.currentTimeMillis();
        System.out.println(String.format("Vector benchMark report : %dms", end - start));
    }
}
