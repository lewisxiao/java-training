package com.lewisxiao.training.chapter02.flowcontrol;

public class SelectDemo {
    public static void main(String[] args) {
        compare(10, 20);
        game(1);
        game(2);
        game(3);
        game(4);
    }

    public static void compare(int x, int y) {
        if (x > y) {
            System.out.println("x is bigger than y");
        } else if (x == y) {
            System.out.println("x equals to y");
        } else {
            System.out.println("x is less than y");
        }
    }

    /**
     * 石头、剪刀、布
     */
    public static void game(int flag) {
        String result = null;

        switch (flag) {
            case 1: {
                result = "石头";
                break;
            }
            case 2: {
                result = "剪刀";
                break;
            }
            case 3: {
                result = "布";
                break;
            }
            default: {
                result = "请遵守游戏规则，正确出拳";
            }
        }
        System.out.println("出拳结果： " + result);
    }
}
