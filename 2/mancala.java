// 2/Mancala.java
//Collaborators: Marisa Laks, Julian Irimina, Mamadu Wally
/*

Game of Mancala

6 5 4 3 2 1 0
M p p p p p p
  p p p  p p  p  M
  7 8 9 10 11 12 13

Create one array of size 14 with the following:

6 :  Player Mancala
0-5 : Player's 1 side
7-12: Computer side
13 Computer Mancala

We need to know how many stones are in each pot and how to store the new amounts after dropping them
*/

import java.util.*;
import java.util.Scanner;

public class Mancala {

  public static void main (String[] args) {

    //array declaration and initialization for the Mancala board
    System.out.println("Testing board");
    int[] manc_board= {4,4,4,4,4,4,0,4,4,4,4,4,4,0 };

    // print out the contents of the board using  Arrays.toString() method. This method returns a string representation of the contents of the specified array.
    System.out.println(Arrays.toString(manc_board));
    System.out.println(" ");
    System.out.println(" ");

   // print the Mancala board
   printBoard(manc_board);
   System.out.println(" ");

   // Player's Turn
   printBoard(playerTurn(manc_board));
  }



//display the contents on the player's side
public static void printBoard(int[] manc_board){
   //prints player side of the board
    for(int i = 6; i>=0; i--) {
      System.out.print(manc_board[i]+ " ");
      }
    System.out.println(" ");
    System.out.println(" ");

    //prints the contents on the computer's side of the board
     for(int i = 7; i<= 13; i++) {
      System.out.print(manc_board[i]+ " ");
        }
} // end of printBoard

 //player turn method
 public static int[] playerTurn(int[] manc_board){

    System.out.println("Choose a pot to pick up stones from 0-5");
    Scanner choice = new Scanner(System.in);
    int playerChoice = choice.nextInt();
    int playerStones = manc_board[playerChoice];

    //print board after player's choice
    System.out.println(" ");
    System.out.println("Player choice pot: " + playerChoice);
    System.out.println("Player stones: " + playerStones);

    int[] manc_board2 = new int[14];
      for (int i = 0; i < 14; i++) {
          manc_board2[i]=manc_board[i];
      }

    // add a value to the indices in the array corresponding to the player side
    for( int i = 7; i<13; i++ )
    {
      manc_board2[i]+=1;
    }
    System.out.println("Modified board: " + Arrays.toString(manc_board2));

    return manc_board;
 } // end of player turn method.

//computer Turn

/*
Next steps:
Assign the computer to pick a random number for the pit it can choose from
Continue creating functionality to transfer stones to the appropriate pits using the for loop

*/

}// end of class

/*
Notes and older version

  int [] AIpot = new int[7];
  int [] mypot = new int[7];

  AIpot [0] = 0;
  AIpot [] = 4;
  mypot [] = 4;
  mypot [6] = 0;

*/

   //pot 0 is AI big pot, pot 1 - 6 are AI little pots, pot 7 - 12 are my little pots, pot 13 is my big pots

   //I choose from pots 7 - 12. In my turn I will never drop a stone into pot 0. After 13 I go to 6. Then to 5.

/*
  int [] pot = new int[14];
  pot [0] = 0;  //AI big pot
  pot [1] = 4;  //AI pot
  pot [2] = 4;  //AI pot
  pot [3] = 4;  //AI pot
  pot [4] = 4;  //AI pot
  pot [5] = 4;  //AI pot
  pot [6] = 4;  //AI pot
  pot [7] = 4;  //my pot
  pot [8] = 4;  //AI pot
  pot [9] = 4;  //AI pot
  pot [10] = 4; //AI pot
  pot [11] = 4; //AI pot
  pot [12] = 4; //AI pot
  pot [13] = 0; //My big pot



  System.out.println ("Which pot would you like to pick from? Choose from pots 7 - 12. ");

  Scanner choice = new Scanner(System.in);
  int n = choice.nextInt();
  */

 //start at index n and add one to each of the following pots.

/*
  int stones = 4;
  if (n = pot [7]) {
    for (i = 7; i <=11; i++) {
     pot[i] = pot[i] + 1;
    }
  }

  if (n = pot [8]) {

  }
  if (n = pot [9]) {}
  if (n = pot [10]) {}
  if (n = pot [11]) {}
  if (n = pot [12]) {}
  */



/*
public static void main (String[] args) {
  System.out.println("This is the game of Mancala. The object of the game is to collect as many stones as possible. Each player picks up stones from their side and drops them in the pots.");

  System.out.println();
  int [] pot = new int[14];

  System.out.print("0");
  for(int i =1; i<=6; i++) {
    System.out.print(" 4");
    }
    System.out.println();

  for(int i = 7; i<= 12; i++) {
    System.out.print(" 4");
    }
  System.out.println(" 0");
  System.out.println();

  play();
}

  */
