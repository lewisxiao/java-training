package com.lewisxiao.training.chapter02.datatype;

public class CharDemo {
    public static void main(String[] args) {
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        char n2 = '中';
        int n3 = '中'; // 汉字“中”的Unicode编码是20013

        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("c1 = " + c3);
        System.out.println("c2 = " + c4);
    }
}
