package com.lewisxiao.training.chapter04.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ConcurrentClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };
        FutureTask<Void> futureTask = new FutureTask<Void>(runnable, null);
        new Thread(futureTask).start();
    }
}
