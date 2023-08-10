package com.david.design.singleton.type7;

/**
 * @Description: 静态内部类方式实现单例，推荐使用
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class Singleton {

    private Singleton() {
    }

    /**
     * 写一个静态内部类,该类中有一个静态属性 Singleton
     */
    private static class SingletonInstance {
        private static final Singleton SINGLETON = new Singleton();
    }

    /**
     * 提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {

        return SingletonInstance.SINGLETON;
    }

    /*
     * 静态内部类的特点：
     * 1. 当前Singleton类被装载的时候，静态内部类SingletonInstance是不会被装载的。
     * 2. 当我们去调用Singleton类的getInstance方法的时候，方法里面用到了静态内部类SingletonInstance，这个时候才会去装载静态内部类，而且只会装载1次。(当类装载的时候线程是安全的)
     * 3. 所有使用静态内部类既能实现懒加载，也能保证线程安全。
     */
}
