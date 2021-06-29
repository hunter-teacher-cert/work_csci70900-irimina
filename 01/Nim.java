// Brian Mueller, Julian Irimina, Jovani Cardenas

/*
PSEUDOCODE:
Start off with 12 stones
loop while stones > 0
    current player is USER or AI
    current player
        scanner choice of 1, 2, 3 stones
        TODO LATER: error handling: type anything else --> error, try again
    AI
        randomly choose 1, 2, 3
    remove stones
after loop, current player wins
*/

import java.util.Scanner;
import java.lang.Math;

class Nim {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the game of Nim. There is a bag with 12 stones.");
        System.out.println("To play this game, you can remove 1-3 stones. You will be playing against the computer.");
        System.out.println("Whoever removes the last stone is the winner.");

        int numStones = 12;
        String currentPlayer = "USER";

        boolean done= false;

        while(numStones > 0){
            if(currentPlayer == "USER"){
                System.out.println("How many stones do you want to remove? Enter 1, 2, or 3.");
                int stonesToRemove = scan.nextInt();
                numStones -= stonesToRemove;
                System.out.println("Stones remaining: " + numStones);
                      if(numStones < 1){
                          //break;
                          done=true;
                      }
                currentPlayer = "COMPUTER";

            } else {
                int stonesToRemove = compNum();
                System.out.println("The computer removed " + stonesToRemove);
                numStones -= stonesToRemove;
                System.out.println("Stones remaining: " + numStones);
                if(numStones < 1){
                  //  break;
                  done=true;
                                 }
                currentPlayer = "USER";
            }
        }
        System.out.println("The winner is " + currentPlayer + ".");
    }

    public static int compNum(){
        return (int) (Math.random()*3 + 1);
    }
}
// future mods: add try - except, have another function that you can then call in the main
