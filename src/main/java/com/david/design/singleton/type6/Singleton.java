package com.david.design.singleton.type6;

import java.util.Objects;

/**
 * @Description: 懒汉式(线程安全 ， 同步方法)(推荐使用)
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
     * <p>
     * 同时保证了效率, 推荐使用
     */
    public static synchronized Singleton getInstance() {

        if (Objects.isNull(instance)) {

            synchronized (Singleton.class) {

                if (Objects.isNull(instance)) {

                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
