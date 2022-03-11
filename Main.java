import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Checkers. Would you like to play single player or with a friend? Type 1 for single player, or any other key for multiplayer");
    String option = kb.nextLine();
    if(option.equals("1")){
      //Start Singleplayer game
      
    }
    else{
      //Start Computer game
    }
    
    Gameboard mainGame = new Gameboard();
    mainGame.setBoard();
    mainGame.toString();
  }
}
/*
*/