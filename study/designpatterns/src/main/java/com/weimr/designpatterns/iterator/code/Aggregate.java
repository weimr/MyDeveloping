package com.weimr.designpatterns.iterator.code;

/**
 * 抽象容器
 * @author weimr
 * @date 2024/01/04
 */
public interface Aggregate {
    //是容器必然有元素的增加
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //由迭代器来遍历所有的元素
    public Iterator iterator();
}
