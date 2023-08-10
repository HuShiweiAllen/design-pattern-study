package com.david.design.prototype.improve;

import lombok.Data;


@Data
public class Sheep2 implements Cloneable {

    private String name;

    private Integer age;

    private String color;

    private String address = "蒙古羊";

    public Sheep2 friend; //是对象,  克隆是会如何处理,  默认是浅拷贝

    public Sheep2(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }

    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {

        Sheep2 sheep = null;
        try {
            sheep = (Sheep2) super.clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sheep;
    }


}
