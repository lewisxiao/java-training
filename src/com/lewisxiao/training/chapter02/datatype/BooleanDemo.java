package com.lewisxiao.training.chapter02.datatype;

public class BooleanDemo {
    public static void main(String[] args) {
        // 比较运算：>, >=, <, <=, ==, !=
        int age = 100;
        boolean result = age == 0;
        System.out.println("比较运算，result = " + result);

        // 逻辑运算：&&, ||, !
        boolean b = 5 < 3;
        result = b && (5 / 0 > 0);
        System.out.println("逻辑运算，result = " + result);

        // 三元运算符： a ? x : y
        result = 100 > 200 ? true : false;
        System.out.println("三元运算符， result = " + result);
    }
}
