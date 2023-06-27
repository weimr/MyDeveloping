package com.weimr.designpatterns.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * 先采用浅拷贝的方式创建 newKeywords。对于需要更新的 SearchWord 对象，我们再使用深度拷贝的方式创建一份新的对象，替换 newKeywords 中的老对象
 */
public class ExampleFour {

    private HashMap<String ,SearchWord> currentKeyWords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeyWords.clone();
        //从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searcheWord : toBeUpdatedSearchWords) {
            if (searcheWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searcheWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searcheWord.getKeyWord())) {
                newKeywords.remove(searcheWord.getKeyWord());
            }
            newKeywords.put(searcheWord.getKeyWord(), searcheWord);

        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeyWords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        //TODO:从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}
