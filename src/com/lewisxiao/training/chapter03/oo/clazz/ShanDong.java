package com.lewisxiao.training.chapter03.oo.clazz;

/**
 * 山东
 *
 * @author xiaoweiqian
 * @date 2022/9/27 15:01
 */
public class ShanDong extends Site {
    @Override
    protected void printFood() {
        System.out.printf("%s 有美食: %s", getName(), "煎饼果子");
    }
}
