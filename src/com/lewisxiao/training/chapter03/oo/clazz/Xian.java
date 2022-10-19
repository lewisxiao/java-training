package com.lewisxiao.training.chapter03.oo.clazz;

/**
 * 西安
 *
 * @author xiaoweiqian
 * @date 2022/9/27 14:59
 */
public class Xian extends Site {
    public Xian() {
        super();
    }

    @Override
    protected void printFood() {
        super.getName();
        System.out.printf("%s 有美食: %s", getName(), "肉夹馍");
        System.out.println();
    }

    public static void belongProvince() {
        System.out.println("西安属于陕西省");
    }
}
