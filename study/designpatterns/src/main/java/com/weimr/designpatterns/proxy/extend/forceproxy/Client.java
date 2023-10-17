package com.weimr.designpatterns.proxy.extend.forceproxy;

public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        //获得指定的代理
        IGamePlayer proxy = player.getProxy();
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
