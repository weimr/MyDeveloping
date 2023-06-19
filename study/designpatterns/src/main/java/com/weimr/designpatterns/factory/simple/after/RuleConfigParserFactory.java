package com.weimr.designpatterns.factory.simple.after;

import com.weimr.designpatterns.factory.*;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }

}
