package com.lewisxiao.training.chapter02.flowcontrol;

import java.util.Arrays;
import java.util.Iterator;

public class LoopDemo {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int i = 0; i < values.length; i++) {
            System.out.println("for loop: " + values[i]);
        }
        System.out.println();

        for (int i : values) {
            if (i > 3) {
                break;
            }
            System.out.println("for each: " + i);
        }
        System.out.println();

        Iterator<Integer> iterator = Arrays.stream(values).iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println("while: " + i);
        }
    }
}
