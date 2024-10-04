package org.example;

/**
 * @author redA
 * @时间: 2024年06月04日 14:02
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("线程1-1");
            System.out.println("线程1-2");
            System.out.println("线程1-3");
        }).start();

        new Thread(()->{
            System.out.println("线程2-1");
            System.out.println("线程2-2");
            System.out.println("线程2-3");
        }).start();
    }
}