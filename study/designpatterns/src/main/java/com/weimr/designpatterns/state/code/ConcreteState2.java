package com.weimr.designpatterns.state.code;

/**
 * 具体环境角色2
 * @author weimr
 * @date 2024/01/09
 */
public class ConcreteState2 extends State{
    @Override
    public void handle1() {
        //设置定钱状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过渡到state2状态，有Context实现
        super.context.handle1();
    }

    @Override
    public void handle2() {

        //本状态下必须处理的逻辑
    }
}
