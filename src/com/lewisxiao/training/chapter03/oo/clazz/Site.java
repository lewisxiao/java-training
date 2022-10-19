package com.lewisxiao.training.chapter03.oo.clazz;

/**
 * 地点类
 *
 * @author xiaoweiqian
 * @date 2022/9/27 14:42
 */
public class Site {
    /**
     * 名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 默认构造函数
     */
    public Site() {
        this("未知城市");
    }

    public Site(String name) {
        this.name = name;
    }

    /**
     * 打印当地美食
     */
    protected void printFood() {
        System.out.println("一片荒地，没有美食");
    }

    @Override
    public String toString() {
        return "Site{" +
                "name='" + name + '\'' +
                '}';
    }
}
