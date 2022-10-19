package com.lewisxiao.training.chapter03.oo.clazz;

public class Demo {
    public static void main(String[] args) {
        Xian xian = new Xian();
        xian.setName("西安");
        xian.printFood();

        Xian.belongProvince();

        // 整数传值调用
        int aInt = 1;
        int bInt = 2;
        swapInt(aInt, bInt);
        System.out.println("aInt = " + aInt);
        System.out.println("bInt = " + bInt);

        // 对象传值调用
        Xian a = new Xian();
        a.setName("西安1号");

        Xian b = new Xian();
        b.setName("西安2号");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * 对象传值调用
     */
    private static void swap(Xian a, Xian b) {
        Xian c = a;
        a = b;
        b = c;
    }

    /**
     * 整数交换
     */
    private static void swapInt(int a, int b) {
        a = 10;
        b = 20;
    }
}
