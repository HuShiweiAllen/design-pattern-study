package com.david.design.singleton.type4;

import java.util.Objects;

/**
 * @Description: 懒汉式单例-线程安全-同步方法实现（不推荐）
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     * 即懒汉式
     *
     * @return 单例
     */
    public static synchronized Singleton getInstance() {

        if (Objects.isNull(instance)) {

            instance = new Singleton();
        }
        return instance;
    }
}
