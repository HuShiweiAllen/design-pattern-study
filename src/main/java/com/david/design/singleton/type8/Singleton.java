package com.david.design.singleton.type8;

/**
 * @Description: 使用枚举，可以实现单例, 推荐
 * @Author: DavidAlen
 * @Date: 2023/4/18
 */
public enum Singleton {

    /**
     * 属性
     */
    INSTANCE;

    public void sayOk() {
        System.out.println("ok~");
    }
}
