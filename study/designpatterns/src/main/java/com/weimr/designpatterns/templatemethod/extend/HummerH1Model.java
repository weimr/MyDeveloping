package com.weimr.designpatterns.templatemethod.extend;

/**
 * 悍马H1模型
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("悍马H1启动");
    }
    @Override
    protected void stop() {
        System.out.println("悍马H1停止");
    }
    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }
    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎轰鸣");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是有客户的来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
