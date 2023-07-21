package com.weimr.designpatterns.templatemethod.before;

public class HummerH2Model extends HummerModel{
    @Override
    protected void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎轰鸣");
    }

    @Override
    protected void run() {
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
