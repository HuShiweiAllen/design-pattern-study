package com.david.design.proxy.staticproxy;

/**
 * @Description: 代理对象-静态代理
 * @Author: DavidAlen
 * @Date: 2023/6/2
 */
public class TeacherDaoProxy implements ITeacherDao {

    /**
     * 目标对象，通过接口聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {

        System.out.println("开始代理 完成某些操作......");

        // 调用被代理对象的方法
        target.teach();

        System.out.println("提交......");

    }
}
