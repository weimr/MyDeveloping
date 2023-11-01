package com.weimr.designpatterns.prototype.extend.constructor;

/**
 * @author weimr
 * @title
 * @date 2023/10/25
 */
public class Client {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
