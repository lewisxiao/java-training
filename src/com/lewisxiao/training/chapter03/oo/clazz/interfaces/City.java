package com.lewisxiao.training.chapter03.oo.clazz.interfaces;

/**
 * 城市类
 *
 * @author xiaoweiqian
 * @date 2022/9/27 14:42
 */
public abstract class City {
    /**
     * 城市名称
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
    public City() {
        this("未知城市");
    }

    public City(String name) {
        this.name = name;
    }

    protected abstract void belongProvince();

    @Override
    public String toString() {
        return "Site{" +
                "name='" + name + '\'' +
                '}';
    }
}
