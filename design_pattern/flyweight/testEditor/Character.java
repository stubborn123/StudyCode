package com.example.test.flyweight.testEditor;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/8/22
 */
public class Character {
    private char c;
    private CharacterStyle style;
    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
