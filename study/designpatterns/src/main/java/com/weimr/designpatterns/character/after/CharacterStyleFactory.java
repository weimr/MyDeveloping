package com.weimr.designpatterns.character.after;

import com.weimr.designpatterns.character.before.Character;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 字符格式工厂
 */
public class CharacterStyleFactory {

    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle style = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle characterStyle : styles) {
            if (characterStyle.equals(style)) {
                return characterStyle;
            }
        }
        styles.add(style);
        return style;
    }
}
