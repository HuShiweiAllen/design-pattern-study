package com.david.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {

        this.target = target;
    }

    /**
     * 给目标对象，生成一个代理对象
     * @return 代理对象
     */
    public Object getProxyInstance() {

        return Proxy.newProxyInstance(
                // 参数1: 被代理类的类加载器
                // 参数2: 被代理类实现的接口
                // 参数3: InvocationHandler()对象
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {

                    System.out.println("JDK 动态代理开始 ......");

                    // 反射机制调用目标对象的方法
                    Object returnVal = method.invoke(target, args);

                    System.out.println("JDK 动态代理提交 ......");

                    return returnVal;
                });
    }
}
