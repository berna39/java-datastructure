package com.queues;

import java.util.PriorityQueue;

public class _PriorityQueue {
    
    /*
     * Interface : Queue
     * 
     * when ? : 
     *  - Same type of data
     *  - Order respected (But not indexes), we'll be retrieving element from head to tail
     *  - LIFO order retrieving
     *  - 
     * 
     */

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("toto");
        pq.add("titi");
        pq.offer("tata");

        System.out.println(pq);

        System.out.println(pq.peek()); // get the head element without deleting -> if the queue is empty it will return null
        System.out.println(pq.element()); // get the head element without deleting -> if the queue is empty it will throw an NoSuchElementException

        System.out.println(pq.poll()); // get the head element and delete it -> if the queue is empty it will return null
        System.out.println(pq.remove()); // get the head element and delete it  -> if the queue is empty it will throw an NoSuchElementException
        
        System.out.println(pq);
    }
}
