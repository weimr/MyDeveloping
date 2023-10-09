package com.weimr.designpatterns.abstractfactory;

/**
 * @title 造人场景类
 * @author weimr
 * @date 2023/10/09
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生态人了
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("--生产一个黄色女性--");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("--生产一个黄色男性--");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}
