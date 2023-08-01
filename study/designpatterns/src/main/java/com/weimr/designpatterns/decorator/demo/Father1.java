package com.weimr.designpatterns.decorator.demo;

/**
 * 场景类
 */
public class Father1 {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = new SugarFouthGradeScloolReport();
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
