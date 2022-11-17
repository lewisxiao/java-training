package com.lewisxiao.training.chapter04.concurrent.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
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

    static class TaskA implements Runnable {
        @Override
        public void run() {
            System.out.println("TaskA 在执行业务逻辑");
        }
    }

    static class TaskB implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("TaskB 在执行业务逻辑");
            return "TaskB";
        }
    }
}
