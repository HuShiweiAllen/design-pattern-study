package com.david.design.prototype.improve;

public class Client {

    public static void main(String[] args) {

        System.out.println("使用原型模式完成对象的创建");

        Sheep2 sheep = new Sheep2("tom", 3, "白色");
        // 有一个引用类型属性
        sheep.setFriend(new Sheep2("jack", 2, "黑色"));

        Sheep2 sheep2 = (Sheep2) sheep.clone();
        Sheep2 sheep3 = (Sheep2) sheep.clone();
        Sheep2 sheep4 = (Sheep2) sheep.clone();
        Sheep2 sheep5 = (Sheep2) sheep.clone();

        // 修改sheep4实力的应用类型属性
        Sheep2 sheep4Friend = sheep4.getFriend();
        sheep4Friend.setName("alice");
        sheep4.setFriend(sheep4Friend);

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode() + "sheep2.getFriend().getName()=" + sheep2.getFriend().getName());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode() + "sheep3.getFriend().getName()=" + sheep3.getFriend().getName());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode() + "sheep4.getFriend().getName()=" + sheep4.getFriend().getName());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode() + "sheep5.getFriend().getName()=" + sheep5.getFriend().getName());
    }

    /**
     * 浅拷贝
     *
     */
}
