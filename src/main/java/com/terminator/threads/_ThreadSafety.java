package com.terminator.threads;

public class _ThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                 for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

         Thread t2 = new Thread(new Runnable() {
            public void run() {
                 for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

class Counter {

    int count;

    public synchronized void increment() { // with the synchronized keyword...if the thread t1 is accessing, t2 has to wait !
        count++;
    }
}
