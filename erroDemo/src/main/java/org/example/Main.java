package org.example;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* try {
            new Main().f2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
      /*  try {
            throwSneakyIOExceptionUsingLombok();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
//        new Main().f2();
        Thread t = new Thread(()->{
                throwSneakyIOExceptionUsingLombok();
        });
        t.start();
        t.join();
        System.out.println("还执行吗？");
    }
    public void f2()  {
        String filename = "test.txt";
        f1(filename);
    }
@SneakyThrows
 public String f1(String filename)  {
     Scanner scanner = new Scanner(new File(filename));
     return scanner.next();
 }
//    @SneakyThrows
    public static void throwSneakyIOExceptionUsingLombok()  {
        throw new RuntimeException("lombok sneaky");
    }
}
