package com.weimr.designpatterns.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestInfo {

    private String action;

    private long endTimeStamp;
    private long responseTime;
}
