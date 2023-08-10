package com.david.design.proxy.dynamicproxy;

/**
 * @Description:
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public interface ITeacherDao {

    /**
     * 授课
     */
    void teach();

    /**
     * 打招呼
     *
     * @param name 名字
     */
    void sayHello(String name);
}
