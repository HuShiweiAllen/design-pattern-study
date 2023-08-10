package com.david.design.factory.simplefactory.pizzastore.order;

import com.david.design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.david.design.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/3
 */
public class OrderPizza {

    // 构造器
//    public OrderPizza() {
//
//        Pizza pizza = null;
//        // 披萨类型
//        String orderType;
//
//        do {
//            orderType = getType();
//            if ("greek".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if ("cheese".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else if ("pepper".equals(orderType)) {
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            } else {
//                break;
//            }
//
//            // 输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        } while (true);
//    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return 披萨种类
     */
    private String getType() {

        String orderType = "";
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类 ： ");
            orderType = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderType;
    }
}
