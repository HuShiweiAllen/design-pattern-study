package com.david.design.singleton.type3;

import java.util.Objects;

/**
 * @Description: 懒汉式单例-线程不安全
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 提供一个静态公有方法，当使用到该方法时，才会创建单例instance
     * 即懒汉式单例
     *
     * @return 单例
     */
    public static Singleton getInstance() {

        if (Objects.isNull(instance)) {

            instance = new Singleton();
        }
        return instance;
    }
}
