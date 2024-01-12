package com.weimr.designpatterns.state.demo.optimize;

/**
 * 抽象电梯状态
 * @author weimr
 * @date 2024/01/08
 */
public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;
    public void setContext(Context _context) {
        this.context = _context;
    }
    //首先电梯门开启动作
    public abstract void open();
    //电梯门可以开启，那当然也就有关闭了
    public abstract void close();
    //电梯要能上能下，运行起来
    public abstract void run();
    //电梯还要能停下来
    public abstract void stop();
}
