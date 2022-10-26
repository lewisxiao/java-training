package com.lewisxiao.training.chapter03.oo.clazz;

import com.lewisxiao.training.chapter03.oo.clazz.interfaces.City;
import com.lewisxiao.training.chapter03.oo.clazz.interfaces.Food;
import com.lewisxiao.training.chapter03.oo.clazz.interfaces.ScenicSpot;

/**
 * 西安
 *
 * @author xiaoweiqian
 * @date 2022/9/27 14:59
 */
public class Xian extends City implements ScenicSpot, Food {

    public static String WELCOME = "欢饮来到西安";

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

    public Xian() {
        super();
    }

    /**
     * 构造函数重载
     * @param provinceName
     */
    public Xian(String provinceName) {
        this.provinceName = provinceName;
    }

    public static void welcome() {
        System.out.println(WELCOME);
        System.out.println();
    }

    @Override
    public void printAllFood() {
        System.out.printf("%s 有美食: %s", getName(), "肉夹馍");
        System.out.println();
    }

    @Override
    protected void belongProvince() {
        System.out.printf("%s 属于: %s", getName(), provinceName);
        System.out.println();
    }

    @Override
    public void printAllSpot() {
        System.out.printf("%s 有景点: %s", getName(), "钟楼，大雁塔，兵马俑");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Xian{" +
                "provinceName='" + provinceName + '\'' +
                '}';
    }
}
