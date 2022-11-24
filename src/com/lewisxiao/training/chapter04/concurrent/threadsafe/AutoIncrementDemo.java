package com.lewisxiao.training.chapter04.concurrent.threadsafe;

import java.util.concurrent.CountDownLatch;

/**
 * 自增运算不是线程安全的
 */
public class AutoIncrementDemo {
    private static Integer amount = 0;

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 10;
        CountDownLatch latch = new CountDownLatch(threadCount);

        for(int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increment();
                }
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("amount = " + amount);
    }

    private static void increment() {
        amount++;
    }
}
