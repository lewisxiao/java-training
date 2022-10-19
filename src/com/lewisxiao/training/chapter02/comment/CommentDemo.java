package com.lewisxiao.training.chapter02.comment;

/**
 * 注释Demo
 * @author xiaoweiqian
 * @date 2022/10/19 14:17
 */
public class CommentDemo {
    public static void main(String[] args) {
        // 调用加法函数
        int sum = plus(3, 5);

        // 输出运算结果
        System.out.println("x + y = " + sum);
    }

    /**
     * 加法：x + y
     * @param x 加数
     * @param y 被加数
     * @return 加法运算后的和
     */
    private static int plus(int x, int y) {
        return x + y;
    }
}
