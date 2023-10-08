package com.weimr.designpatterns.methodfactory.demo;

/**
 * 抽象人类创建工厂
 * @author weimr
 * @date 2023/10/07
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human>T createHuman(Class<T> c);
}
