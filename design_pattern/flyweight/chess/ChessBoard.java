package com.example.test.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangpeng
 * @Description:  享元模式---棋局
 * @Date: 2022/8/22
 */
public class ChessBoard {
//    常规模式下的棋盘
//    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();
//    public ChessBoard() {    init();  }
//    private void init() {
//        chessPieces.put(1, new ChessPiece(1, "車", ChessPiece.Color.BLACK, 0, 0));
//        chessPieces.put(2, new ChessPiece(2,"馬", ChessPiece.Color.BLACK, 0, 1));    //...省略摆放其他棋子的代码...
//        }
//        public void move(int chessPieceId, int toPositionX, int toPositionY) {
//        //...省略...
//        }



    private Map chessPieces = new HashMap<>();
    public ChessBoard() { init(); }
    private void init() {
        chessPieces.put(1, new ChessPiece( ChessPieceUnitFactory.getChessPiece(1), 0,0));
        chessPieces.put(1, new ChessPiece( ChessPieceUnitFactory.getChessPiece(2), 1,0)); //...省略摆放其他棋子的代码...
        }
        public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
        }

}
