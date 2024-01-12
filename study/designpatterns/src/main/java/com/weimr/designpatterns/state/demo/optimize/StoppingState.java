package com.weimr.designpatterns.state.demo.optimize;

/**
 * 停止状态
 * @author weimr
 * @date 2024/01/09
 */
public class StoppingState extends LiftState{
    //停止状态开门也是正常逻辑
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        this.context.getLiftState().open();
    }
    //停止状态下电梯门本来就是关着的
    @Override
    public void close() {
        //do nothing
    }
    //停止状态再运行起来
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        this.context.getLiftState().run();
    }
    //停止状态继续停止
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
