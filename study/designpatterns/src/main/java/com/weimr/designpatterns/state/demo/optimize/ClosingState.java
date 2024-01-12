package com.weimr.designpatterns.state.demo.optimize;

/**
 * @author weimr
 * @date 2024/01/09
 */
public class ClosingState extends LiftState{
    //电梯门关了再打开
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }
    //电梯门关闭，这个关闭状态要实现的动作
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }
    //电梯门关了就运行，这是再正常不过了
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
    //电梯门关着，我就不安楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
