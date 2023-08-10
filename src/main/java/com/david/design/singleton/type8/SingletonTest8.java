package com.david.design.singleton.type8;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class SingletonTest8 {

    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(true);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOk();
    }
}
