package com.weimr.designpatterns.proxy.demo.proxy;

/**
 * @author weimr
 * @title 场景类
 * @date 2023/10/17
 */
public class Client {
    public static void main(String[] args) {
        //定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
        //开始打游戏
        System.out.println("开始时间是：2009-8-23 10:45");
        proxy.login("张三", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录游戏结束时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
