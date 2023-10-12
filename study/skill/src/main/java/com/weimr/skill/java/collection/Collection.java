package com.weimr.skill.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @title 集合
 * @author weimr
 * @date 2023/10/11
 */
public class Collection {
    public static void main(String[] args) {
        String[] names = {"三", "四", "五", "六", "七"};
        List<User> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            User user = User.builder()
                    .id(i)
                    .name(names[i % 5])
                    .age(i).build();
            list.add(user);
        }
        //分组求和
        Map<String, Integer> groupMap = list.stream().collect(Collectors.groupingBy(User::getName, Collectors.summingInt(User::getAge)));
        groupMap.keySet().forEach(s -> {
            System.out.println("name:" + s + ", total:" + groupMap.get(s));
        });
    }

}
