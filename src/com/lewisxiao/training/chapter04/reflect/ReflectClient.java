package com.lewisxiao.training.chapter04.reflect;

import java.lang.reflect.Field;

public class ReflectClient {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        changeEmployeeName();
    }

    /**
     * 利用反射修改 private 修饰的变量
     */
    private static void changeEmployeeName() throws IllegalAccessException, NoSuchFieldException {
        Employee employee = new Employee("张三");
        Class clazz = employee.getClass();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("修改前, name = " + field.get(employee));

        field.set(employee, "李四");
        System.out.println("修改后, name = " + field.get(employee));
    }
}
