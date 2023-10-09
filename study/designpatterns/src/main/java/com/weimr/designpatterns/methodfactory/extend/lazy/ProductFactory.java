package com.weimr.designpatterns.methodfactory.extend.lazy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weimr
 * @title
 * @date 2023/10/09
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //如果Map中已经有这个对象
        if(prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            product = new Product();
            //把对象放入到缓存容器中
            prMap.put(type, product);
        }
        return product;
    }
}
