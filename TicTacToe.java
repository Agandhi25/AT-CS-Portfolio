//Importing scanner for user input
import java.util.Scanner;
//Importing lists and arrays and ArrayLists since they're used in the program
import java.util.List; 
import java.util.ArrayList;
import java.util.Arrays;

//This class holds all code and methods 
class Main {
  //main (String[] args) holds all the execution needed for the code to run
  public static void main(String[] args) {
  //2D character array of the gameboard 
    char[][] gameboard = {{' ', '|', ' ', '|', ' ',},
                          {'-', '+', '-', '+', '-',},
                          {' ', '|', ' ', '|', ' ',}, 
                          {'-', '+', '-', '+', '-',},
                          {' ', '|', ' ', '|', ' ',}, 
      
    };
    //Function implementation shown later and prints board when needed 
    printDAboard(gameboard);
    //While loop keeps repeating allowing 2 users to keep playing.
    //However, win condition was taken out
    while (true) {
      //Scans input from player 1
      Scanner scan = new Scanner(System.in);
      System.out.println("Player 1, Enter your placement (1-9): ");
      int pos = scan.nextInt();
      //Tracks and prints player 1's placement
      System.out.println(pos);
      PieceOnBoard(gameboard, pos, "player"); 
      printDAboard(gameboard);
      //Scans input from player 2 
      System.out.println("Player 2, enter your placement (1-9): ");
      int pos2 = scan.nextInt();
      //Tracks and prints player 2's placement
      System.out.println(pos2);
      PieceOnBoard(gameboard, pos2, "player2");
      //prints the board after every turn
      printDAboard(gameboard);
}
  }
  //This method is responsible for printing the gameboard
  public static void printDAboard (char[][] gameboard) {
    //Uses an nested enhanced for loop to traverse each element of the array
    for(char[] row : gameboard) {
      for(char c: row) {
        System.out.print(c);
      }
      System.out.println("");
    }
  }
  //This method is responsible for placing either x or o for each place on the grid
  public static void PieceOnBoard (char[][] gameboard, int pos, String user) {
    //character symbol is initially blank for either x or o 
    char symbol = ' '; 
    //if statement to print x for player 1
    if(user.equals("player")) {
      symbol = 'x'; 
    }
    //else if statement to print o for player 2
    else if (user.equals("player2")) {
      symbol = 'o'; 
    }
    //Using a switch case to print pos regardless of what the symbol is
    //We used a switch case to switch between any case based on user input
    switch(pos) {
      // case 1 prints symbol on row 0, column 0
      case 1:
        gameboard [0][0] = symbol; 
        break;
    }
    switch(pos) {
      //case 2 prints symbol on row 0, column 2
      case 2:
        gameboard [0][2] = symbol; 
        break;
    }
    switch(pos) {
      //case 3 prints symbol on row 0, column 4
      case 3:
        gameboard [0][4] = symbol; 
        break;
    }
    switch(pos) {
      //case 4 prints symbol on row 2, column 0
      case 4:
        gameboard [2][0] = symbol; 
        break;
    }
    switch(pos) {
      // case 5 prints symbol on row 2, column 2
      case 5:
        gameboard [2][2] = symbol; 
        break;
    }
    switch(pos) {
      //case 6 prints symbol on row 2, column 4
      case 6:
        gameboard [2][4] = symbol; 
        break;
    }
    switch(pos) {
      //case 7 prints symbol on row 4, column 0
      case 7:
        gameboard [4][0] = symbol; 
        break;
    }
    switch(pos) {
      //case 8 prints symbol on row 4, column 2
      case 8:
        gameboard [4][2] = symbol; 
        break;
    }
    switch(pos) {
      //case 9 prints symbol on row 4, column 4
      case 9:
        gameboard [4][4] = symbol; 
        break;
    }
  }
}