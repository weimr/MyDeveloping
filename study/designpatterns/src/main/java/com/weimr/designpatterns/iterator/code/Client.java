package com.weimr.designpatterns.iterator.code;

/**
 * 场景类
 * @author weimr
 * @date 2024/01/04
 */
public class Client {
    public static void main(String[] args) {
        //声明出容器
        Aggregate agg = new ConcreteAggregate();
        //产生对象数据放进去
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");
        //遍历
        Iterator iterator = agg.iterator();
        while(iterator.hasnNext()) {
            System.out.println(iterator.next());
        }
    }
}
