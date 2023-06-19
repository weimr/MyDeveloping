package com.weimr.designpatterns.factory.method;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
