package com.weimr.skill.java.collection;

import lombok.Builder;
import lombok.Data;

/**
 * @author weimr
 * @title
 * @date 2023/10/11
 */
@Data
@Builder
public class User {

    private int id;

    private String name;

    private int age;
}
