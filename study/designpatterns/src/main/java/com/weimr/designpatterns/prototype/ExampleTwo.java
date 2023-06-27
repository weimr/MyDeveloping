package com.weimr.designpatterns.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * 从数据库中取出所有的数据，放入到newKeywords中
 */
public class ExampleTwo {

    private HashMap<String, SearchWord> currentKeyWords = new HashMap<>();

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        //从数据库中取出所有的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords();
        for (String key : newKeywords.keySet()) {
            newKeywords.put(key, newKeywords.get(key));
        }
        currentKeyWords = newKeywords;
    }

    private List<SearchWord> getSearchWords() {
        //TODO：从数据库中取出所有的数据
        return null;
    }
}
