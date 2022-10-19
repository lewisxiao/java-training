package com.lewisxiao.training.chapter04.generic;

import java.util.ArrayList;

public class GenericClient {
    public static void main(String[] args) {
        noGenric();
        generic();
        genericClass();
        genericMethod();
    }

    /**
     * 集合操作：无泛型方式
     *
     * 1. 没有编译器检查
     * 2. 类型不安全，需要强制转型
     */
    private static void noGenric() {
        ArrayList data = new ArrayList();
        data.add("abc");
        data.add("def");
        data.add(1);
        data.add(true);
        data.add(1001L);
        data.add(new String[] {"a", "b", "c", "d"});
        String value = (String) data.get(0);
        System.out.println("无泛型：" + value);
    }

    /**
     * 集合操作：泛型方式
     */
    private static void generic() {
        ArrayList<String> data = new ArrayList<>();
        data.add("abc");
        data.add("def");
        String value = data.get(0);
        System.out.println("有泛型：" + value);
    }

    /**
     * 泛型类
     */
    private static void genericClass() {
        MyPair<String, Integer> myPair = new MyPair<>();
        myPair.setFirst("西安");
        myPair.setSecond(100);
        System.out.println("自定义泛型类：" + myPair);
    }

    /**
     * 泛型方法
     */
    private static void genericMethod() {
        String alphabet = MyPair.<String>getMiddle("a", "b", "c");
        System.out.println("泛型方法：" + alphabet);
    }
}
