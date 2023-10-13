package com.weimr.designpatterns.builder.demo.optimizefinal;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;

/**
 * @author weimr
 * @title 车辆模型的抽象类
 * @date 2023/10/12
 */
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    //模型是启动开始跑了
    protected abstract void start();
    //能发动，还要能停下来，那才是真本事
    protected abstract void stop();
    //喇叭会发出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    final public void run() {
        //循环一遍，谁在前，就先执行谁
        for(int i=0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(StringUtils.equals(actionName, "start")) {
                this.start();//启动汽车
            } else if(StringUtils.equals(actionName, "stop")) {
                this.stop();//停止汽车
            } else if(StringUtils.equals(actionName, "alarm")) {
                this.alarm();//喇叭开始叫了
            } else if(StringUtils.equals(actionName, "engine boom")) {
                this.engineBoom();//引擎开始轰鸣
            }
        }
    }
    //把传递过来的值传递到类内
    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
