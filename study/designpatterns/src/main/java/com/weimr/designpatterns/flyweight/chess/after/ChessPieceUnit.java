package com.weimr.designpatterns.flyweight.chess.after;

/**
 * 棋子
 * 享元类
 */
public class ChessPieceUnit {

    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }
}
