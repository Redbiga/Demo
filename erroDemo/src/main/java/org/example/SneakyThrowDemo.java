package org.example;

/**
 * @author redA
 * @时间: 2024年06月21日 14:20
 */
public class SneakyThrowDemo {
    public static void main(String[] args) {
        new    SneakyThrowDemo().unCheck();
    }

    public void unCheck(){
        String a = null;
        a.toString();
    }
}