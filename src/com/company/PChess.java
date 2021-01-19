package com.company;

import processing.core.PApplet;

   public class PChess extends PApplet {
    Board board;

    public PChess(Board noard) {
        board= new Board();
    }

    public static void main(String[] args) {
        PChess pChess=new PChess();
        Board b=pChess.board;
        b.initializer();
    }

}


