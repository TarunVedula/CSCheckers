public class Move{
  public String[][] GenerateMove(Gameboard board, String playerTurn){// either w for white or b for black
    int colorMultiplier;
    for (String[] row : board){
      for (String square : row){
        if(square.substring(0,1).equals(playerTurn.substring(0,1))){ // if the piece is your team
          if (square.substring(0,1).equals())
          if (board[row-1][]){
            //board[currentY-1][currentX-1]
          }
          if (){
            
          }
          if(!square.equals(playerTurn)){
            
          }
        }
      }
    }
  }

}
/*
Move Class
  GenerateMove
    Generate possibilities
    Look at each square
    If correct checker is there, identify what type (king, normal), and look diagonally to see if there is an open space
      If there is an opening, it is identified as a move
      If there is a checker in an adjacent space, but there is space beyond that piece, that is identified as a jump
    Go back through the list, and there were any jumps, delete all of the simple moves //because the player is not forced to jump, and cannot make other moves
    If no valid moves, tell them to pick another checker
      Checks to see if there are checkers to jump, if there is space, if there are forced jumps
    Return valid moves
  ExecuteMove   // this deals with one move. If double, triple jumps, we will call this 
    Check if last row, if yes then turn into king
  multiple times
    Refresh
      Remove piece from starting place
      If applicable, remove jumped piece
        Subtract from total number of checkers

*/