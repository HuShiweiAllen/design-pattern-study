package com.david.design.factory.simplefactory.pizzastore.order;

import com.david.design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Description: 简单工厂
 * @Author: DavidAlen
 * @Date: 2023/4/27
 */
public class SimpleFactory {

    // 添加一个orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式......");
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if ("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    // 简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式......");
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if ("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }



}
