package com.weimr.designpatterns.proxy.extend.commonproxy;

public class Client {
    public static void main(String[] args) {
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
