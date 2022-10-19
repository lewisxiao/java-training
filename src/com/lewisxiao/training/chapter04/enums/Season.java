package com.lewisxiao.training.chapter04.enums;

public enum Season {
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    private String desc;

    Season(String desc) {
        System.out.println("构造函数： " + desc);
        this.desc = desc;
    }
}
