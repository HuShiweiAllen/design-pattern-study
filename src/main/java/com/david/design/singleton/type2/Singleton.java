package com.david.design.singleton.type2;

/**
 * @Description: 饿汉式-静态代码块
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {

    // 1. 私有构造器
    private Singleton() {
    }

    // 2. 本类内部创建实例
    private static Singleton instance;

    // 在静态代码块里面创建单例对象
    static {
        instance = new Singleton();
    }

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {

        return instance;
    }
}
