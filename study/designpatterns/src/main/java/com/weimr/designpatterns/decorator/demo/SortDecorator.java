package com.weimr.designpatterns.decorator.demo;

/**
 * 排名情况修饰
 */
public class SortDecorator extends Decorator{
    //构造函数
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    //老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
