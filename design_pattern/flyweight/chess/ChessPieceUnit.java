package com.example.test.flyweight.chess;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/8/22
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;
    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id; this.text = text; this.color = color;
    }
    public static enum Color { RED, BLACK } // ...省略其他属性和getter方法...
}
