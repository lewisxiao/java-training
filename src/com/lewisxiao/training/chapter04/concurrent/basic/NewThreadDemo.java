package com.lewisxiao.training.chapter04.concurrent.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式
 *
 * @author xiaoweiqian
 * @date 2022/11/16 15:38
 */
public class NewThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 在执行业务逻辑");
        });
        t1.start();

        Thread t2 = new Thread(new TaskA());
        t2.start();

        FutureTask<String> future = new FutureTask<>(new TaskB());
        Thread t3 = new Thread(future);
        t3.start();
        System.out.println("TaskB 返回结果 = " + future.get());
    }

    /**
     * 创建线程的方法1：
     * a. 继承 Thread 类
     * b. 重写 run 方法，在 run 方法中定义自己的业务逻辑
     */
    static class ThreadA extends Thread {
        @Override
        public void run() {
            System.out.println("ThreadA 在执行业务逻辑");
        }
    }

    /**
     * 创建线程的方法2：
     * a. 实现 Runnable 接口
     * b. 重写 run 方法，在 run 方法中定义自己的业务逻辑
     */
    static class TaskA implements Runnable {
        @Override
        public void run() {
            System.out.println("TaskA 在执行业务逻辑");
        }
    }

    /**
     * 创建线程的方法3：
     * a.实现 Callable 接口
     * b. 构造 FutureTask 实例
     */
    static class TaskB implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("TaskB 在执行业务逻辑");
            return "TaskB";
        }
    }

    /**
     * 创建线程的方法4：
     * a. 线程池创建线程，达到复用、提升性能的目的
     */
}
