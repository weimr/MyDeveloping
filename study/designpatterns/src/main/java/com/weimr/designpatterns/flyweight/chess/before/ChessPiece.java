package com.weimr.designpatterns.flyweight.chess.before;

/**
 * 棋子
 */
public class ChessPiece {
    private int id;
    private String text;
    private Color color;
    private int x;
    private int y;

    public ChessPiece(int id, String text, Color color, int x, int y) {
        this.id = id;
        this.text = text;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public static enum Color {
        RED, BLACK
    }
}
