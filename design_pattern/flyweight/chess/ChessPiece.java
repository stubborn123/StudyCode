package com.example.test.flyweight.chess;

/**
 * @Author: zhangpeng
 * @Description:  享元模式---棋子
 * @Date: 2022/8/22
 */
public class ChessPiece {
    //常规模式下的棋子代码
//    private int id;
//    private String text;
//    private Color color;
//    private int positionX;
//    private int positionY;
//
//    public ChessPiece(int id, String text, Color color, int positionX, int positionY) {
//        this.id = id;
//        this.text = text;
//        this.color = color;
//        this.positionX = positionX;
//        this.positionY = positionX;
//    }
//
//    public static enum Color {    RED, BLACK  }
//
//    // ...省略其他属性和getter/setter方法...}



    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;
    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
