package org.example;

public class Test {

    public static void fun1() {
        fun2();//第8行
    }

    public static void fun2() {
        fun3();
    }

    public static void fun3() {
        fun4();
    }
    public static void fun4(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        fun1();
    }

}
