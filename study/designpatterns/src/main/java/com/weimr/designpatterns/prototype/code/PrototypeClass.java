package com.weimr.designpatterns.prototype.code;

/**
 * @author weimr
 * @title 原型模式通用源码
 * @date 2023/10/25
 */
public class PrototypeClass implements Cloneable {
    //覆写父类Object方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
