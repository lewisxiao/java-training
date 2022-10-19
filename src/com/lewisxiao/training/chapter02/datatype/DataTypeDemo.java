package com.lewisxiao.training.chapter02.datatype;

import java.util.Arrays;

/**
 * 数据类型
 *
 * @author xiaoweiqian
 * @date 2022/9/23 14:17
 */
public class DataTypeDemo {
    public static void main(String[] args) {
//        byteOverflow();

//        intOverflow();

//        arrayType();
    }

    /**
     * byte类型溢出
     */
    public static void byteOverflow() {
        byte data = (byte) (Byte.MAX_VALUE + 1);
        System.out.println("byte 向上溢出: " + data);

        data = (byte) (Byte.MIN_VALUE - 1);
        System.out.println("byte 向下溢出: " + data);
    }

    /**
     * int类型溢出
     */
    public static void intOverflow() {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println("int 向上溢出" + sum); // -2147483641
    }

    /**
     * 数组类型
     */
    private static void arrayType() {
        // 声明数组
        int[] a = new int[10];
        int b[] = new int[10];

        // 匿名数组
        int[] c = {1, 2, 3, 4, 5};

        // 遍历数组
        for (int data : c) {
            System.out.println(data);
        }

        // 拷贝数组
        int[] d = Arrays.copyOf(c, c.length);


        // 小练习
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }
}
