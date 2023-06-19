package com.weimr.designpatterns.factory.method;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
