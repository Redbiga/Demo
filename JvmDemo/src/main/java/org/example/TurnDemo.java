package org.example;

import java.util.concurrent.locks.LockSupport;

/**
 * @author redA
 * @时间: 2024年09月27日 下午6:12
 */
public class TurnDemo {
    static Thread threadA;
    static Thread threadB;
    static Thread threadC;
    public static void main(String[] args) {


            threadA = new Thread(()->printA(),"threadA");
            threadB = new Thread(()->printB(),"threadB");
            threadC = new Thread(()->printC(),"threadC");
            threadA.start();
            threadB.start();
            threadC.start();

    }
    public  static void printA() {
        for (int i = 0; i <10;i++){
            System.out.println("A");
            LockSupport.unpark(threadB);
            LockSupport.park();
        }
    }
    public  static void printB() {
        for(int i = 0; i < 10; i++){
            LockSupport.park();
            System.out.println("B");
            LockSupport.unpark(threadC);
        }
    }
    public  static void printC() {
        for (int i = 0; i < 10;i++){
            LockSupport.park();
            System.out.println("C");
            LockSupport.unpark(threadA);
        }
    }
}