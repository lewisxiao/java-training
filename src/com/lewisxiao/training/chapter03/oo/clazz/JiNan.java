package com.lewisxiao.training.chapter03.oo.clazz;

import com.lewisxiao.training.chapter03.oo.clazz.interfaces.City;
import com.lewisxiao.training.chapter03.oo.clazz.interfaces.Food;
import com.lewisxiao.training.chapter03.oo.clazz.interfaces.ScenicSpot;

/**
 * 济南
 *
 * @author xiaoweiqian
 * @date 2022/9/27 15:01
 */
public class JiNan extends City implements ScenicSpot, Food {

    /**
     * 省会名称
     */
    private String provinceName;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public JiNan() {
        super();
    }

    @Override
    public void printAllFood() {
        System.out.printf("%s 有美食: %s", getName(), "煎饼果子");
    }

    @Override
    protected void belongProvince() {
        System.out.printf("%s 属于: %s", getName(), provinceName);
        System.out.println();
    }

    @Override
    public void printAllSpot() {
        System.out.printf("%s 有景点: %s", getName(), "趵突泉，大明湖");
        System.out.println();
    }
}
