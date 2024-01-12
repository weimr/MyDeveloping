package com.weimr.designpatterns.state.code;

/**
 * 具体环境角色1
 * @author weimr
 * @date 2024/01/09
 */
public class ConcreteState1 extends State{
    @Override
    public void handle1() {
        //本状态下必须处理的逻辑
    }

    @Override
    public void handle2() {
        //设置定钱状态为state2
        super.context.setCurrentState(Context.STATE2);
        //过渡到state2状态，有Context实现
        super.context.handle2();
    }
}
