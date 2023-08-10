package com.david.design.proxy.dynamicproxy;


/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class Client {

    public static void main(String[] args) {

        // 创建目标对象
        TeacherDao target = new TeacherDao();

        // 给目标对象，创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // 通过代理对象调用目标对象的方法
        //proxyInstance.teach();
        proxyInstance.sayHello("David Alen");
    }
}
