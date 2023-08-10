package com.david.design.proxy.staticproxy;

/**
 * @Description: 被代理对象
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {

        System.out.println("老师授课中...");
    }
}
