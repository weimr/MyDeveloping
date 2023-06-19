package com.weimr.designpatterns.factory;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.simple.RuleConfig;

public class XmlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return null;
    }
}
