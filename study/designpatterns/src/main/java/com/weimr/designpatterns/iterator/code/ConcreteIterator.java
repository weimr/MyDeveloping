package com.weimr.designpatterns.iterator.code;

import java.util.Vector;

/**
 * 具体迭代器
 * @author weimr
 * @date 2024/01/04
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }
    @Override
    //返回下一个元素
    public Object next() {
        Object result = null;
        if(this.hasnNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    //判断是否到达尾部
    public boolean hasnNext() {
        if(this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
