package com.weimr.designpatterns.state.demo.perfect;

import java.sql.SQLOutput;

/**
 * 电梯实现类
 * @author weimr
 * @date 2024/01/08
 */
public class Lift implements ILift{
    private int state;
    public void setState(int state) {
        this.state = state;
    }
    //电梯门关闭
    public void close(){
        //电梯在什么状态下才能关闭
        switch(this.state){
            //可以关门，同时修改电梯状态
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            //电梯是关门状态，则什么都不做
            case CLOSING_STATE:
                //do nothing
                break;
            //电梯正在运行，门本来就是关闭的，则什么都不做
            case RUNNING_STATE:
                //do nothing
                break;
            //电梯是停止状态，门也是关闭的，则什么都不做
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }
    //电梯门开启
    public void open(){
        //电梯在什么状态下才能开启
        switch(this.state){
            //闭门状态，什么都不做
            case OPENING_STATE:
                //do nothing;
                break;
            //闭门状态，则可以开启
            case CLOSING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            //运行状态，则不能开门，什么都不做
            case RUNNING_STATE:
                //do nothing
                break;
            //停止状态，可以开门
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }
    //电梯开始运行起来
    public void run(){
        //电梯在什么状态下才能运行
        switch(this.state){
            //敞门状态，什么都不做
            case OPENING_STATE:
                //do nothing;
                break;
            //闭门状态，则可以运行
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            //运行状态，则不能开门，什么都不做
            case RUNNING_STATE:
                //do nothing
                break;
            //停止状态，可以开门
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }
    //电梯停止
    public void stop(){
        //电梯在什么状态下才能停止
        switch(this.state){
            //敞门状态，什么都不做
            case OPENING_STATE:
                //do nothing;
                break;
            //闭门状态，则可以停止
            case CLOSING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            //运行状态，可以停止
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            //停止状态，什么都不做
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }
    //纯粹的电梯关门，不考虑实际的逻辑
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }
    //纯粹的电梯开门，不考虑任何条件
    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }
    //纯粹的运行，不考虑其它条件
    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }
    //纯粹的停止，不考虑其它条件
    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
