package com.weimr.designpatterns.decorator.common;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义具体构件
        Component component = new ConcreteComponent();
        //第一次装饰
        component = new ConcreteDecorator1(component);
        //第二次装饰
        component = new ConcreteDecorator2(component);
        //调用业务方法
        component.operation();
    }
}
