package org.example;

import java.util.concurrent.locks.LockSupport;

public class PrintOddEven {
    private static Thread oddThread;
    private static Thread evenThread;
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        oddThread = new Thread(() -> {
            while (count <= MAX_COUNT) {
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    LockSupport.unpark(evenThread);
                } else {
                    LockSupport.park();
                }
            }
        }, "OddThread");

        evenThread = new Thread(() -> {
            while (count <= MAX_COUNT) {
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    LockSupport.unpark(oddThread);
                } else {
                    LockSupport.park();
                }
            }
        }, "EvenThread");

        oddThread.start();
        evenThread.start();

//        LockSupport.unpark(oddThread); // 先启动奇数线程
    }
}