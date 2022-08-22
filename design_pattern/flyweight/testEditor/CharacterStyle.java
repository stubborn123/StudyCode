package com.example.test.flyweight.testEditor;

import java.awt.*;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/8/22
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
        return font.equals(otherStyle.font)
                && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}
