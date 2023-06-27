package com.weimr.designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchWord {

    private String keyWord;
    private long count;
    private long lastUpdateTime;
}
