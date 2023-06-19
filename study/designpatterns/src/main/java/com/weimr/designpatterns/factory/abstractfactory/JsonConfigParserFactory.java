package com.weimr.designpatterns.factory.abstractfactory;

import com.weimr.designpatterns.factory.IRuleConfigParser;
import com.weimr.designpatterns.factory.JsonRuleConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
