package com.weimr.designpatterns.prototype.deepcopy;

import com.weimr.designpatterns.prototype.SearchWord;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 递归拷贝对象、对象的引用对象以及引用对象的引用对象……直到要拷贝的对象只包含基本数据类型数据，没有引用对象为止
 */
public class recursion {

    private HashMap<String, SearchWord> currentKeyWords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // Deep copy
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        for(Map.Entry<String, SearchWord> e : currentKeyWords.entrySet()) {
            SearchWord searchWord = e.getValue();
            SearchWord newSearchWord = new SearchWord(searchWord.getKeyWord(), searchWord.getCount(), searchWord.getLastUpdateTime());
            newKeywords.put(e.getKey(), newSearchWord);
        }
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
