package org.example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author redA
 * @时间: 2024年09月17日 下午4:03
 */
public class Main {
    static AtomicInteger num = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for(int i =0;i<=3;i++){
            Thread t = new Thread(()->{
                while (num.get() <= 100){
                    num.compareAndSet(num.get(),num.get()+1);
//                    System.out.println(Thread.currentThread().getName()+" "+num.get());
                }
            });
            t.start();
            t.join();
            System.out.println(num);
        }

    }
}