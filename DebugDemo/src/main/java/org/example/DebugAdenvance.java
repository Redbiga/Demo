package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author redA
 * @时间: 2024年06月04日 23:41
 */
public class DebugAdenvance {
    public  static void printStackTrace()
    {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
    public static void  Stream()
    {
        Arrays.asList(1,2,3,4,5).stream()
                .filter(i->i>2)
                .map(i->i*2)
                 .forEach(System.out::println);
    }
    public static void main(String[] args) {
//        printStackTrace();
        Stream();
    }
}