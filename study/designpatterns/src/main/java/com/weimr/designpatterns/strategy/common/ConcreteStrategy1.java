package com.weimr.designpatterns.strategy.common;

/**
 * 具体的策略角色1
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
