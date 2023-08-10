package com.david.design.singleton.type5;

import java.util.Objects;

/**
 * @Description: 懒汉式(线程安全 ， 同步代码块)(不推荐使用)
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
