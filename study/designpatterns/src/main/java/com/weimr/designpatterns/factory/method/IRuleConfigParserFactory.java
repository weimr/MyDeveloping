package com.weimr.designpatterns.factory.method;

import com.weimr.designpatterns.factory.IRuleConfigParser;

public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
