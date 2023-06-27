package com.weimr.designpatterns.prototype;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 为了保证数据的实时性，需要定期根据数据库中的数据，更新内存中的索引和数据
 */
public class ExampleOne {
    private ConcurrentHashMap<String, SearchWord> currentKeyWords = new ConcurrentHashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // 从数据库中取出更新时间>lastUpdateTime的数据，放入到currentKeyWords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for(SearchWord searchWord : toBeUpdatedSearchWords) {
            if(searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if(currentKeyWords.containsKey(searchWord.getKeyWord())) {
                currentKeyWords.replace(searchWord.getKeyWord(), searchWord);
            } else {
                currentKeyWords.put(searchWord.getKeyWord(), searchWord);
            }
        }
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        //TODO：从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}
