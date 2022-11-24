package com.lewisxiao.training.chapter04.concurrent.basic;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
