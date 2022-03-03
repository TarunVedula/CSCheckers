public class Gameboard{
  // some are always null
  // w - white
  // wk - white king
  // b - black
  // bk - black king
  private String[][] board;
  public Gameboard(){
    board = new String[8][8]; 
  }  
  public void setBoard(){
    //First row of black pieces
    board[0][1]= "b";
    board[0][3]= "b";
    board[0][5]= "b";
    board[0][7]= "b";
    // Second row of black pieces
    board[1][0]= "b";
    board[1][2]= "b";
    board[1][4]= "b";
    board[1][6]= "b";
    //Third row of black pieces  
    board[2][1]= "b";
    board[2][3]= "b";
    board[2][5]= "b";
    board[2][7]= "b";
    
    //First row of white pieces
    board[5][0]= "w";
    board[5][2]= "w";
    board[5][4]= "w";
    board[5][6]= "w";
    // Second row of white pieces
    board[6][1]= "w";
    board[6][3]= "w";
    board[6][5]= "w";
    board[6][7]= "w";
    //Third row of white pieces
    board[7][0]= "w";
    board[7][2]= "w";
    board[7][4]= "w";
    board[7][6]= "w"; 
  }
  public String toString(){
   for (String [] rows : board){
     for(String val : rows){
       System.out.print(val);
     }
     System.out.println();
   }
    return "";
  }
  }
/*
Create 2d array board
Setting starting positions
*/
