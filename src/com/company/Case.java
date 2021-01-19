package com.company;

public class Case {
    char rank; // 1-8
    char column; //a -h
    Piece piece;


    public boolean isBlack() {
          return ( getX() +  getY() ) % 2 ==1 ;

    }
    public int getX(){
        return rank - '1';
    }

    public int getY(){
        return rank - 'a';
    }



}
