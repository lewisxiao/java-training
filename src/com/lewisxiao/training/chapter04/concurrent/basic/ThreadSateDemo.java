package com.lewisxiao.training.chapter04.concurrent.basic;

import java.util.concurrent.TimeUnit;

/**
 * 线程状态和转换
 *
 * @author xiaoweiqian
 * @date 2022/11/16 11:33
 */
public class ThreadSateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            infiniteLoop();
        }, "ThreadStateDemo-1");

        System.out.println("线程刚创建, state = " + thread.getState());

        thread.start();
        System.out.println("线程正在运行, state = " + thread.getState());

        thread.interrupt();
        // 休眠1秒，等待子线程结束
        TimeUnit.SECONDS.sleep(1);
        System.out.println("线程已结束, state = " + thread.getState());
    }

    private static void infiniteLoop() {
        while (!Thread.currentThread().isInterrupted()) {
        }
    }

    private static void sleep() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("线程被打断");
            }
        }
    }
}
