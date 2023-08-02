package com.weimr.designpatterns.strategy.strategyenum;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为："+a+symbol+b);
        System.out.println("运行结果为："+a+symbol+b+"=" + StrategyEnum.ADD.exec(a,b));
    }
}
