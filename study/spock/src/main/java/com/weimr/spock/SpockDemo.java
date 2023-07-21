package com.weimr.spock;

import java.util.Objects;

public class SpockDemo {

    public static int compare(User user1, User user2) {
        if(Objects.isNull(user1.getAge()) || Objects.isNull(user2.getAge())) {
            return -1;
        }
        return user1.getAge().compareTo(user2.getAge());
    }
}
