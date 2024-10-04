package org.example;

/**
 * @author redA
 * @时间: 2024年06月21日 17:06
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ThreadLock {

    /**
     * 拿来加锁的对象
     */
    private static final Object WAIT_OBJECT = new Object();

    /**
     * 日志，如果您没有log4j，请使用System.out
     */
    private static final Log LOGGER = LogFactory.getLog(ThreadLock.class);

    /**
     * 偷懒，我把异常全部抛出了。正式系统不要这么搞哦！！
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Thread threadA = new Thread(() -> {
            // 检查'对象锁'状态。
            synchronized (ThreadLock.WAIT_OBJECT) {
                ThreadLock.LOGGER.info("做了一些事情。。。。");
            }
        });

        Thread threadB = new Thread(() -> {
            // 检查'对象锁'状态。
            synchronized (ThreadLock.WAIT_OBJECT) {
                ThreadLock.LOGGER.info("做了另一些事情。。。。");
            }
        });
        System.out.println(1);
        threadA.start();
        threadB.start();
    }
}