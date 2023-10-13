package com.weimr.skill.java.object;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author weimr
 * @title 对象工具类
 * @date 2023/10/12
 */
public class ObjectUtils {
    public static void main(String[] args) {
        // 对象拷贝
        Object1 obj1 = new Object1();
        Object2 obj2 = new Object2();
        BeanCopier.create(obj1.getClass(), obj2.getClass(), false).copy(obj1,
                obj2, null);
    }
}
