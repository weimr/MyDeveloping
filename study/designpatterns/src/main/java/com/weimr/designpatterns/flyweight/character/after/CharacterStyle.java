package com.weimr.designpatterns.flyweight.character.after;

import java.awt.*;

/**
 * 字符格式
 */
public class CharacterStyle {

    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font) && size == otherStyle.size && colorRGB == otherStyle.colorRGB;
    }
}
