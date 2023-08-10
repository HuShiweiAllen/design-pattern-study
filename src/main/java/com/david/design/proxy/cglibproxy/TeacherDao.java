package com.david.design.proxy.cglibproxy;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class TeacherDao {

    public String teach() {

        System.out.println("老师授课中， 我是Cglib代理， 不需要实现接口 .......");

        return "Hello Cglib Proxy ......";
    }
}
