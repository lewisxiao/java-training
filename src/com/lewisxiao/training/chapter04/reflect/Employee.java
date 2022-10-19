package com.lewisxiao.training.chapter04.reflect;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    private void printName() {
        System.out.println("Employee name = " + this.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
