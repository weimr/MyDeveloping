package com.weimr.one;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.weimr.one")
public class AppConfig {

    private UserService userService;
}
