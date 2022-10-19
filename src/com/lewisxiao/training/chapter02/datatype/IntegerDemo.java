package com.lewisxiao.training.chapter02.datatype;

public class IntegerDemo {
    public static void main(String[] args) {
        // 四则运算：加减乘除
        int result = (10 + 15) / (15 - 5) * 2;
        System.out.println("四则运算: result = " + result);

        // 取模运算
        result = 5 % 2;
        System.out.println("取模运算：result = " + result);

        // 位运算, 10 & 1010 = 0000
        result = 2 & 8;
        System.out.println("位运算：result = " + result);

        // 位移运算, 100 - 10
        result = 4 >> 1;
        System.out.println("右移1位：result = " + result);
    }
}
