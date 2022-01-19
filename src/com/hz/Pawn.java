package com.hz;

public class Pawn {
    private Color color;

    private int pos;

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String show() {
        return this.color.getColor() + this.pos;
    };
}
