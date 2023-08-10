package com.david.design.singleton.msb;

import java.util.concurrent.ConcurrentHashMap;

/**
 * lazy loading-也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带米效下降
 *
 * @description:
 * @author: DavidAlen
 * @date: 2023/7/24
 **/
// DCL（Double Check）单例
public class Mgr06 {

    // volatile关键字必须有
    private static volatile Mgr06 INSTANCE;

    private Mgr06() {
    }

    public static Mgr06 getInstance() {

        // 业务逻辑代码省略
        if (INSTANCE == null) {
            // 双重检查
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
