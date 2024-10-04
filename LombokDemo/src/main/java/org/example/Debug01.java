package org.example;

/**
 * @author redA
 * @时间: 2024年05月28日 18:28
 */
public class Debug01 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += i;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
            System.out.println("退出程序");
        }
    }
}