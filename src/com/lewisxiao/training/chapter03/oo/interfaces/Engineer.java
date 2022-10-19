package com.lewisxiao.training.chapter03.oo.interfaces;

public class Engineer implements Employee, ShadowEmployee {
    @Override
    public void work() {
        System.out.println("Engineer is coding...");
    }
}
