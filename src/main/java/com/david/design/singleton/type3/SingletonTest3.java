package com.david.design.singleton.type3;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class SingletonTest3 {

    public static void main(String[] args) {

        System.out.println("懒汉式 1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
