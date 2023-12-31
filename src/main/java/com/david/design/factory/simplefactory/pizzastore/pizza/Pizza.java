package com.david.design.factory.simplefactory.pizzastore.pizza;

/**
 * @Description: 将Pizza 类做成抽象
 * @Author: DavidAlen
 * @Date: 2023/6/3
 */
public abstract class Pizza {

    /**
     * 名字
     */
    protected String name;

    /**
     * 准备原材料，不同的披萨不一样，我们做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking ......");
    }

    public void cut() {

        System.out.println(name + " cutting ......");
    }

    /**
     * 打包
     */
    public void box() {

        System.out.println(name + " boxing ......");
    }

    public void setName(String name) {
        this.name = name;
    }
}
