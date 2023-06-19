package com.weimr.designpatterns.factory.abstractfactory;


import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {

    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("properties", new PropertiesConfigParserFactory());
    }

    public static IConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IConfigParserFactory factory = cachedFactories.get(type.toLowerCase());
        return factory;
    }
}
