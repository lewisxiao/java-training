package com.lewisxiao.training.chapter04.concurrent.threadsafe;

import org.openjdk.jol.info.ClassLayout;

/**
 * 使用OpenJDK提供的JOL工具查看类的结构
 *
 * @author xiaoweiqian
 * @date 2022/11/24 11:50
 */
public class ClassStructureDemo {
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(Employee.class).toPrintable());
    }
}
