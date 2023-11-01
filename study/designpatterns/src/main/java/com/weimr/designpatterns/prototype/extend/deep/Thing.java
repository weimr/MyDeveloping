package com.weimr.designpatterns.prototype.extend.deep;

import java.util.ArrayList;

/**
 * @author weimr
 * @title 浅拷贝
 * @date 2023/10/25
 */
public class Thing implements Cloneable {

    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //对私有变量进行拷贝
            this.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }
    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
