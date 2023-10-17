package com.weimr.designpatterns.proxy.extend.dynamic.code;

/**
 * @author weimr
 * @title 通知实现
 * @date 2023/10/17
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
