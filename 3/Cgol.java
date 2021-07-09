//Team: Marina M, Eric Wilson, Iulian J Irimina

import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

// It works now. It was a curly brace.

public class Cgol_d
{

  //initialize empty board (all cells dead)

  public static char[][] createNewBoard(int rows, int cols) {
    // create a new 2D array and include the parameters as the size
   char [][]board = new char[rows][cols];
    for (int row=0; row<board.length; row++){
      for (int col=0; col<board[0].length; col++) {
        //board [row][col]=' ';
        setCell(board,row,col,'-');
    }
}
   return board;
}

  //print the board to the terminal
  public static void printBoard(char[][] board) {
    	for (int row=0; row<board.length; row++){		//Printing by rows
        for (int col=0; col<board[0].length; col++){
          System.out.print(board[row][col] + " ");
    }
   	System.out.println(" ");
	  }
  }


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){
   // initialize the values,hard code r and c to have values of x inital screen
      board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int r, int c) {

   int LivCellCounter=0;
     //create conditions for living cells found in the adjancent indices


  if(isAlive(board, r-1, c)){
      LivCellCounter++;
    }

   if(isAlive(board,r-1,c+1)) {
     LivCellCounter++;
   }
   if(isAlive(board,r-1,c-1)) {
        LivCellCounter++;
      }
   if(isAlive(board, r, c-1)){
     LivCellCounter++;
   }

   if(isAlive(board, r+1,c)){
       LivCellCounter++;
   }
   if(isAlive(board, r, c+1)){
     LivCellCounter++;
   }

   if(isAlive(board, r+1, c-1)){
     LivCellCounter++;
   }

    if(isAlive(board, r+1, c+1)){
         LivCellCounter++;
       }

  // System.out.print(LivCellCounter);
   return LivCellCounter;
   }

//tells if the cell is alive
public static boolean isAlive(char [][] board, int r, int c)
//check to see if cell exists based on row or col
{
  if(r > board.length-1 || c > board[0].length -1 || c < 0)
  {
    return false;
  }
  else {      //check if it is a living  cell
    if(board[r][c] == 'X')
    {
      return true;
    }
    else{
      return false;
    }
  }
}



     //precond: given a board and a cell
     //postcond: return next generation cell state based on CGOL rules
     //(alive 'X', dead ' ')

   public static char getNextGenCell(char[][] board, int r, int c) {

    int LivCellCounter = countNeighbours(board,r,c);

     if(isAlive(board,r,c)){
       if(LivCellCounter==3 || LivCellCounter==2)
       {
         return 'X';  //there is life
       }else{
         return '-'; // death
       }

     } else{
      if(LivCellCounter==3)
      {
        return 'X';
      }else {
        return '-';
      }
    }
  }

public static char[][] copyOldBoard(char[][] olderBoard)
{
  char[][] newerBoard = new char[olderBoard.length][olderBoard[0].length];
    for (int i = 0; i < newerBoard.length  ; i ++) {
      for (int j = 0; j < newerBoard[0].length; j++){
        newerBoard[i][j] = olderBoard[i][j];
        //copies amd stores the older board cells in the newer board in the same places
      }
    }
    return newerBoard;
}


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {

    //create a new array to generate the nextBoard
  //char[][] nextBoard = new char[board.length][board[0].length];


    char[][] newerBoard = copyOldBoard(board);

    //go through the old board to change the new board
      for (int row=0; row<board.length; row++){          //change
        for (int col=0; col<board[0].length; col++) {  //change

            //add the cell at row/col
             char nextGenCellChar = getNextGenCell(board, row, col);
             //nextBoard[row][col]= getNextGenCell(board, row,col);
           //now the new nextBoard
           setCell(newerBoard,row,col,nextGenCellChar);
        }
     }
     return newerBoard;
    }

    public static boolean isGameOver(char[][] board){
        //when everything is dead then game over
        int LivCellCounter = 0;
        for (int row = 0; row < board.length; row++) {
          for (int col = 0; col < board[0].length; col ++) {
            if(isAlive(board,row,col)){ //if we find any cell that is alive, the game is not over
              return false;
            }
          }
        }
      return true; //if we went through all cells and none are alive then game is over
    }


//MAIN Method
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Welcome to the Game of Life! Enter the size of the game board:  ");
    //use the variable twice to get a 2D array

    int size = input.nextInt();

    char[][] board;
	  board=createNewBoard(size, size);

    //prompt hpw many cell inputs user would like
    System.out.print("How many living cells would you like to start with? ");
    int living = input.nextInt();

    for(int i = 0; i < living; i++){
      System.out.println("Where would you like to put the living cell? Choose a row and a column. ");
      //use x for row and y for column
      System.out.print("row: ");
      int x = input.nextInt();
      System.out.print("column: ");
      int y = input.nextInt();
      setCell(board, x, y, 'X');
    }

  //  int LivCellCounter;
  //  LivCellCounter=countNeighbours(board,2,3);
  /*
    setCell(board, 0, 1, 'X');
    setCell(board, 0, 2, 'X');
    setCell(board, 1, 1, 'X');
    setCell(board, 1, 3, 'X');
    setCell(board, 2, 0, 'X');
    setCell(board, 2, 1, 'X');
    */
      //setCell(board, 3, 0, 'X');

      System.out.println("Gen X:");
      printBoard(board);
      System.out.println("--------------------------\n\n");


     board = generateNextBoard(board);
     System.out.println("Gen X+1:");
      printBoard(board);
      System.out.println("--------------------------\n\n");

      int i = 0;
    //  boolean done=false;
       while(true){
         board = generateNextBoard(board);
         System.out.println("Generation: " + (i+1));
         printBoard(board);
         if(isGameOver(board)){
           System.out.println("Your populations all died. GAME OVER.");
           break;
           //done=true;;
         }
         i++;
       }

	}


 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 //
 int[][] dataChart = new int [15][8];
  ^new 2d array called dataChart that has 15 row, 8 col
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

}//end class
