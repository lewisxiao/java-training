package com.lewisxiao.training.chapter04.enums;

import java.util.Arrays;

public class EnumClient {
    public static void main(String[] args) {
        Arrays.stream(Season.values()).forEach(System.out::println);

        System.out.println(Season.AUTUMN);
    }
}
