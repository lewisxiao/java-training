package com.lewisxiao.training.chapter04.concurrent.basic;

import java.util.concurrent.TimeUnit;

/**
 * 线程阻塞
 *
 * @author xiaoweiqian
 * @date 2022/11/16 15:22
 */
public class ThreadStateBlockDemo {

    private static final Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (object) {
                while (!Thread.currentThread().isInterrupted()) {
                    // 省略业务代码
                }
            }
        }, "Thread-1");
        t1.start();

        // 等待 t1 线程获取锁
        TimeUnit.MILLISECONDS.sleep(500);

        Thread t2 = new Thread(() -> {
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + " 获得了锁，state = " + Thread.currentThread().getState());
            }
        }, "Thread-2");
        t2.start();

        // 等待 t2 线程获取锁
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(t2.getName() + " 被阻塞了，state = " + t2.getState());

        // 中断 t1 线程，释放锁
        t1.interrupt();

        // 等待 t2 获得锁，并执行业务逻辑
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(t2.getName() + " 执行成功，state = " + t2.getState());
    }
}
