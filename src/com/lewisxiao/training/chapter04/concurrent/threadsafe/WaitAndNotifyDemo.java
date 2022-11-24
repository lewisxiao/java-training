package com.lewisxiao.training.chapter04.concurrent.threadsafe;

import java.util.concurrent.TimeUnit;

/**
 * 使用 Object.wait() 和 Object.notify() 完成线程间通信
 *
 * @author xiaoweiqian
 * @date 2022/11/24 15:52
 */
public class WaitAndNotifyDemo {
    private static final Object objectLock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (objectLock) {
                System.out.println("t1 获取到了锁");
                System.out.println("t1 在等待唤醒");
                try {
                    objectLock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t1 被唤醒了");
            }
        });

        t1.start();

        // 等待两秒，让 t1 线程获取锁
        TimeUnit.SECONDS.sleep(2);

        Thread t2 = new Thread(() -> {
            synchronized (objectLock) {
                System.out.println("t2 获取到了锁");
                System.out.println("t2 开始唤醒 t1");
                objectLock.notify();
            }
        });

        t2.start();
    }
}
