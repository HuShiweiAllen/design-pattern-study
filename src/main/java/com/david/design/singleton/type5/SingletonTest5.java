package com.david.design.singleton.type5;

import com.david.design.singleton.type3.Singleton;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class SingletonTest5 {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
