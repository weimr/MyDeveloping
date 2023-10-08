package com.weimr.designpatterns.methodfactory.demo;

/**
 * @title 女娲类
 * @author weimr
 * @date 2023/10/07
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了
        System.out.println("--造出的第一批人是白色人种--");
        WhiteHuman whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女娲第二次造人，火候过足，于是黑人产生了
        System.out.println("--造出的第二批人是黑色人种--");
        BlackHuman blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //女娲第三次造人，火候刚刚好，于是黄色人种人产生了
        System.out.println("--造出的第三批人是黄色人种--");
        YellowHuman yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
