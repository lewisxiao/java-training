package com.lewisxiao.training.chapter02.datatype;

/**
 * 字符串
 *
 * @author xiaoweiqian
 * @date 2022/9/26 14:15
 */
public class StringDemo {
    public static void main(String[] args) {
//        concat();

//        escape();

//        immutable();

//        implicitTypeConverter();

//        equals();

        buildString();
    }

    /**
     * 字符串拼接
     */
    private static void concat() {
        // 空字符串
        String a = "";

        // 空值null
        String b = null;

        // 字符串拼接
        String c = "Hello " + "Java" + " \u4e2d";
        System.out.println("字符串拼接, c = " + c);
        System.out.println();
    }

    /**
     * 转义字符串， 常见的有：
     *
     * 单引号: \'
     * 双引号: \"
     * 反斜杠: \\
     * 换行符: \n
     * 回车符: \r
     * 制表符: \t
     * unicode编码
     */
    private static void escape() {
        String s = "ABC\n\u4e2d\u6587";
        System.out.println("转义字符串, s = " + s);
        System.out.println();
    }

    /**
     * 字符串的不可变性: 字符串的不可变是指字符串内容不可变
     */
    private static void immutable() {
        String a = "Hello";
        String b = a;
        a = "Java";
        System.out.println("字符串的不可变性, b = " + b); // b 是 Java, 还是 Hello
        System.out.println();
    }

    /**
     * 隐式转换
     */
    private static void implicitTypeConverter() {
        // 基础类型
        int a = 100;
        double b = 12.34;
        System.out.println("基础类型转换, a + b = " + a + b);

        // 对象转换
        Person person = new Person();
        person.setAge(25);
        person.setName("Bill Gates");
        System.out.println("对象类型转换, person = " + person);
        System.out.println();
    }

    /**
     * 字符串相等比较
     */
    private static void equals() {
        String a = "Hello";
        String b = new String("Hello");

        // 比较两个字符串是否指向同一个位置
        System.out.println("字符创相等比较 == , a == b = " + (a == b));

        // 比较字符串的值
        System.out.println("字符创相等比较 equals, a == b = " + a.equals(b));

        // 判断字符串是否为 null
        String c = null;
        System.out.println("字符创相等比较 判断null, c == null = " + (c == null));
        System.out.println();
    }

    /**
     * 构建字符串
     */
    private static void buildString() {
        // 普通字符串拼接，每次拼接都会创建一个新对象
        long start = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i < 100000; i++) {
            s += "a";
        }

        long end = System.currentTimeMillis() - start;
        System.out.printf("构建字符串 - 字符串拼接, 耗时：%s 毫秒\n", end);

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            builder.append("a");
        }

        end = System.currentTimeMillis() - start;
        System.out.printf("构建字符串 - StringBuilder, 耗时：%s 毫秒\n", end);

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("a");
        }

        end = System.currentTimeMillis() - start;
        System.out.printf("构建字符串 - StringBuffer, 耗时：%s 毫秒\n", end);
    }
}
