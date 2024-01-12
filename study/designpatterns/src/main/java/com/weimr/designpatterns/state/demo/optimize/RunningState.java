package com.weimr.designpatterns.state.demo.optimize;

/**
 * 运行状态
 * @author weimr
 * @date 2024/01/09
 */
public class RunningState extends LiftState{
    //运行的时候开电梯门？这太可怕了，电梯不会开门
    @Override
    public void open() {
        //do noting
    }
    //电梯门关闭，这个是正常的
    @Override
    public void close() {
        //do noting
    }
    //这是在运行状态下要实现的方法
    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }
    //运行时停下来也是很正常的
    @Override
    public void stop() {
        this.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
