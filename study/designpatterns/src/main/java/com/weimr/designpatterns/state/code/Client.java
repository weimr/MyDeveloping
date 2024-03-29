package com.weimr.designpatterns.state.code;

/**
 * 场景类
 * @author weimr
 * @date 2024/01/09
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //行为执行
        context.handle1();
        context.handle2();
    }
}
