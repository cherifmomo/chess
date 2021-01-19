package com.company;

public class Board {

    PChess pChess;
    Case[][] cases = new Case[8][8];

    public Board(PChess pChess) {
        this.pChess = pChess;
        for( int x=0; x<8; x++){
            for( int y=0; y<8; y++) {
                cases[x][y]=new Case();
            }
        }
    }



}
