package org.example;

/**
 * @author redA
 * @时间: 2024年09月27日 下午12:28
 */
class SharedResource {
    private volatile boolean flag = false; // 使用 volatile 关键字修饰
    private int a = 0;

    public void writer() {
        a = 42;          // 操作 A: 写普通变量
        flag = true;     // 操作 B: 写 volatile 变量
    }

    public void reader() {
        if (flag) {      // 操作 C: 读 volatile 变量
            System.out.println(a); // 操作 D: 读普通变量
        }
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread writerThread = new Thread(() -> {
            resource.writer();  // 写线程执行 writer 方法
        });

        Thread readerThread = new Thread(() -> {
            resource.reader();  // 读线程执行 reader 方法
        });

        // 启动写线程
        readerThread.start();  // 启动读线程
        writerThread.start();
        writerThread.join();   // 等待写线程完成
        readerThread.join();   // 等待读线程完成
    }
}
