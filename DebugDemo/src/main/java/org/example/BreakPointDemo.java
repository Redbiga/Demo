package org.example;

/**
 * @author redA
 * @时间: 2024年06月03日 23:26
 */
public class BreakPointDemo {
    public static void  line(){
        System.out.println("行断点");
    }
    public static void detailLine(){
        System.out.println("详细断点");
    }
    public static void exception(){
        System.out.println("异常断点");
        Person person = null;
        person.toString();

    }
//    方法断点
    public static void method(){
        System.out.println("方法断点");
        System.out.println("方法断点结束的地方");

    }
//    属性断点
    public static void file(){
        Person person = new Person();
        person.setName("redA");
        person.setAge(18);
        person.setName("www");
        System.out.println("属性断点");
    }

    public static void main(String[] args) {
//        line();
//        detailLine();
//        file();
//        exception();
        method();
    }


}