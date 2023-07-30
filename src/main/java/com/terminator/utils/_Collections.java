package com.terminator.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Collections {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(4);
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);
        numbers.add(2);

        System.out.println(numbers);

        Collections.sort(numbers); // sort

        System.out.println(numbers);

        Collections.reverse(numbers); // reverse

        System.out.println(numbers);

        Collections.replaceAll(numbers, 2, 9);

        System.out.println(numbers);

        Collections.rotate(numbers, 3); // rotate items by distance 3

        System.out.println(numbers);

        Collections.swap(numbers, 0, 2); // swapping items

        System.out.println(numbers);

        System.out.println(Collections.frequency(numbers, 2)); // frequency of a given item
        System.out.println(Collections.max(numbers)); // the max -> we can go far using comparators
        System.out.println(Collections.min(numbers)); // the min 

        // The most important feature for me is that this class helps us by getting Thread Safety

        List<String> squad = Collections.synchronizedList(new ArrayList<>()); // a thread safe ArrayList :)
        squad.add("Vinicius");
        squad.add("Rodrygo");
        squad.add("Tchouameni");
        squad.add("Modric");
        squad.add("Kross");
        squad.add("Alaba");
        squad.add("Valverde");
        System.out.println(squad);

        // we can do the same for maps with synchronizedMap() and synchronizedSet() for sets
    }
}
