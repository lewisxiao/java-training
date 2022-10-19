package com.lewisxiao.training.chapter03.oo.interfaces;

public interface ShadowEmployee {
    default void work() {
        System.out.println("you are not working");
    }
}
