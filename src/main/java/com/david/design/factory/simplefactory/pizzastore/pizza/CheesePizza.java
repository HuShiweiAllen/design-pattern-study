package com.david.design.factory.simplefactory.pizzastore.pizza;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/3
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {

        System.out.println(" 给制作奶酪披萨 准备原材料 ......");
    }
}
