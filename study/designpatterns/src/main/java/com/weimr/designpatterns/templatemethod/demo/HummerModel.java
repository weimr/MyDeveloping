package com.weimr.designpatterns.templatemethod.demo;

/**
 * 悍马模型
 */
public abstract class HummerModel {
    //模型要能够启动起来
    protected abstract void start();
    //能启动，也要能停下来
    protected abstract void stop();
    //还要能鸣笛，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();
    //模板方法：模型应该会跑
    protected final void run() {
        //先启动
        this.start();
        //引擎轰鸣
        this.engineBoom();
        //然后鸣笛
        this.alarm();
        //最后停止
        this.stop();
    }
}
