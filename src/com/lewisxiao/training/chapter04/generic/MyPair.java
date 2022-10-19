package com.lewisxiao.training.chapter04.generic;

public class MyPair<T, S> {
    private T first;
    private S second;

    public MyPair() {
    }

    public MyPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    /**
     * 泛型方法
     */
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
