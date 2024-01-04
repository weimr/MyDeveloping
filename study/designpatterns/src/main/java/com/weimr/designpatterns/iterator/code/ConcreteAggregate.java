package com.weimr.designpatterns.iterator.code;

import java.util.Vector;

/**
 * 具体容器
 * @author weimr
 * @date 2024/01/04
 */
public class ConcreteAggregate implements Aggregate {
    //容纳对象的容器
    private Vector vector = new Vector();
    @Override
    //增加一个元素
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    //删除一个元素
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    //返回迭代器对象
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
