package com.lewisxiao.training.chapter02.datatype;

public class FloatDemo {
    public static void main(String[] args) {
        // 浮点运算只有四则运算，而且运算结果不精准
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println("四则运算，x = " + x);
        System.out.println("四则运算，y = " + y);

        // 类型提升，整数跟浮点数一起运算，计算结果为浮点型
        int n = 5;
        double d = 1.2 + 24.0 / n;
        System.out.println("类型提升，d = " + d);


        // 强制转型，浮点型强转为整形。小数部分会丢掉，精度如果超过整形最大表示范围，将返回整形最大值
        int value = (int) Double.MAX_VALUE;
        System.out.println("强制转型，value = " + value);
    }
}
