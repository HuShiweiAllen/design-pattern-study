package com.david.design.proxy.cglibproxy;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class Client {

    public static void main(String[] args) {

        // 创建目标对象
        TeacherDao target = new TeacherDao();

        // 获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        // 执行代理对象的方法，会触发 intercept 方法，从而实现，对目标对象的调用
        String res = proxyInstance.teach();

        System.out.println("res = " + res);
    }
}
