package com.david.design.prototype.deepclone;

public class Client {

    public static void main(String[] args) {

        DeepProtoType p = new DeepProtoType();
        p.setName("宋江");
        p.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "小牛"));

        //方式 1  完成深拷贝
//	DeepProtoType p2 = (DeepProtoType) p.clone();
//	System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//	System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        //方式 2  完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        DeepCloneableTarget deepCloneableTarget = p2.getDeepCloneableTarget();
        deepCloneableTarget.setCloneName("小小牛");
        p2.setDeepCloneableTarget(deepCloneableTarget);


        System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode() + "p.getDeepCloneableTarget().getCloneName()=" + p.getDeepCloneableTarget().getCloneName());
        System.out.println("p2.name=" + p.getName() + "p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode()+ "p2.getDeepCloneableTarget().getCloneName()=" + p2.getDeepCloneableTarget().getCloneName());
    }
}
