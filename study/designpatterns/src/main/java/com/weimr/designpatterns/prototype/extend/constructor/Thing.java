package com.weimr.designpatterns.prototype.extend.constructor;

/**
 * @author weimr
 * @title 简单的可拷贝对象
 * @date 2023/10/25
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了...");
    }
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
