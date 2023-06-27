package com.weimr.designpatterns.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * 原型模式就是这么简单，拷贝已有对象的数据，更新少量差值
 */
public class ExampleThree {

    private HashMap<String, SearchWord> currentKeyWords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // 原型模式就是这么简单，拷贝已有对象的数据，更新少量差值
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeyWords.clone();
        // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for(SearchWord searchWord : toBeUpdatedSearchWords) {
            if(searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if(newKeywords.containsKey(searchWord.getKeyWord())) {
                SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyWord());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeywords.put(searchWord.getKeyWord(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeyWords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        //TODO：从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}
