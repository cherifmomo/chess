package com.company;

public class Board {
    Case[][] cases = new Case[8][8];
    public void initializer(){
        int cols=8; //case column
        int rows=8;// case rank
          for(int i=0;i<cols;i++){
              for(int j=0;j<rows;j++){
                  int x=i; // x-coordinate of the rectangle by default
                  int y=j; // y-coordinate of the rectangle by default
                  if ((i+j) % 2 == 0) { // excellent
                     this.cases[i][j]=1;
                  } else {
                      this.cases[i][j]=0;
                  }
                  //   rect(x, y, squareSize, squareSize);
              }
          }


    }

}
