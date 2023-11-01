package com.weimr.designpatterns.prototype.extend.shallow;

/**
 * @author weimr
 * @title 浅拷贝测试
 * @date 2023/10/25
 */
public class Client {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //设置一个值
        thing.setValue("张三");
        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
