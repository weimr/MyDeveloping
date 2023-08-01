package com.weimr.designpatterns.decorator.demo;

/**
 * 抽象装饰者
 */
public abstract class Decorator extends SchoolReport{
    //首先我要知道是哪个成绩单
    private SchoolReport schoolReport;
    //构造函数，传递成绩单过来
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }
    //成绩单还是要被看到的
    @Override
    public void report() {
        this.schoolReport.report();
    }
    //看完还是要签名的
    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
