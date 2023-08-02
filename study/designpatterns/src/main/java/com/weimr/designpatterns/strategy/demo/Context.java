package com.weimr.designpatterns.strategy.demo;

/**
 * 锦囊
 */
public class Context {
    //抽象策略
    private IStrategy strategy = null;
    //构造函数设置具体策略
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    //封装后的策略方法
    public void operate(){
        this.strategy.operate();
    }
}
