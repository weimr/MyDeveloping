package com.weimr.designpatterns.state.code;

/**
 * 具体环境角色
 * @author weimr
 * @date 2024/01/09
 */
public class Context {
    //定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    //当前状态
    private State currentState;
    //获取当前状态
    public State getCurrentState() {
        return currentState;
    }
    //设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        //切换状态
        this.currentState.setContext(this);
    }
    //行为委托
    public void handle1() {
        this.currentState.handle1();
    }
    public void handle2() {
        this.currentState.handle2();
    }
}
