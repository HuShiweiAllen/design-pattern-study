package com.david.design.singleton.type1;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public class SingletonTest01 {

    public static void main(String[] args) {

        // 测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() ： " + instance1.hashCode());
        System.out.println("nstance2.hashCode() ： " + instance2.hashCode());
    }
}
