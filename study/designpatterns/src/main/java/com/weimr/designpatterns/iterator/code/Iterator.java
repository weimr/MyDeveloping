package com.weimr.designpatterns.iterator.code;

/**
 * 抽象迭代器
 * @author weimr
 * @date 2024/01/04
 */
public interface Iterator {
    //遍历到下一个元素
    public Object next();
    //是否已经遍历到尾部
    public boolean hasnNext();
    //删除当前指向的元素
    public boolean remove();
}
