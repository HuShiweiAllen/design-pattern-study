package com.david.design.proxy.dynamicproxy;


/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {

        System.out.println("老师授课中......");
    }

    @Override
    public void sayHello(String name) {

        System.out.println("Hello " + name);
    }
}
