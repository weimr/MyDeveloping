package com.weimr.designpatterns.methodfactory.code;

/**
 * @title 具体工厂类
 * @author weimr
 * @date 2023/10/08
 */
public class ConcreteCreator extends Creator{

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
