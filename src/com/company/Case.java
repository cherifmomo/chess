package com.company;

public class Case {
    char rank;
    char column;
    Piece piece;


    public Case() {
           piece= new Piece(this);

    }


}
