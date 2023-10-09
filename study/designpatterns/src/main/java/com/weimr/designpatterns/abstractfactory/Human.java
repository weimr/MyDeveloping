package com.weimr.designpatterns.abstractfactory;

/**
 * @title 人种接口
 * @author weimr
 * @date 2023/10/09
 */
public interface Human {
    //每个人种都有相应的颜色
    public void getColor();
    //人类会说活
    public void talk();
    //每个人都有性别
    public void getSex();
}
