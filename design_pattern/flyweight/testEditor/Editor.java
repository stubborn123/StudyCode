package com.example.test.flyweight.testEditor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/8/22
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();
    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
