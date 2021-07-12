import java.util.*;
import java.util.Random;

public class Craps{
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);

  //The main program should take a parameter from the command line
  System.out.println("Enter number of rounds you would like to play: ");
	int rounds = input.nextInt();

  //play that many rounds and as it plays indicate each time the shooter wins or loses
  for(int i = 0; i<rounds; i++)
  {

    System.out.println("Round: " +i);
    System.out.println(round());
  }

}
public static int roll(int num1)
{
  Random ranNum = new Random(); // instance of random class
  int result = ranNum.nextInt(num1+1);
  //result++;
  return result;
}
/*
You will write a program named Craps.java that will play a simplified game of craps.

There should be at least three static methods in addition to main.
One named roll which accepts an integer parameter and returns a random number
 between 1 and that number, inclusive. */


 public static int shoot(int dice, int max)
 {
   int total = 0;
   for(int i = 0; i < dice; i++)
   {
     total += roll(max);
   }
   return total;
 }
 /*
There should also be one named shoot which accepts two parameters -
a number of dice and the maximum value for those dice and returns the result of
rolling those dice.*/


public static String round()
{
//should return something to indicate if the shooter of the round wins or loses.
//The shooter shoots (rolls) two dice.

 int playerRoll= shoot(2,6);

 //int point= -1;
 System.out.println("You rolled a "+ playerRoll);

 //while (true)
   //{
     if (playerRoll==2 || playerRoll==3 || playerRoll==12)
     //If 2,3, or 12,that’s Craps and he loses.
      {
        //return false;
        return "That's Craps, You lose.";

      }
     else if( playerRoll ==7 || playerRoll==11)
     {
       //return true;
       return "That's a natural. You win.";
     }
     else
     {
       System.out.println("You continue to shoot until you roll Point or 7.");
       //the value rolled is now called Point
       int point = playerRoll;
       //point=playerRoll;

       boolean shoots = true;

       while(shoots)
       {
          playerRoll= shoot(2,6);
          if(playerRoll == point)
          {
            shoots=false;
            return "You rolled a "+playerRoll + " which is Point. You win!";
          }
          else if(playerRoll== 7)
          {
            shoots=false;
            return "You rolled a "+ playerRoll + " You lose";
          }
          else
          {
            System.out.println("You rolled a " + playerRoll + " which means you roll again!");
          }
       }
      return "End of round";
     }
  // }
}
/*
The third method should be named round. It should accept no parameters and it
should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:
the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again
at which point he wins or he rolls a 7 at which point he loses.
The main program should take a parameter from the command line, play that
many rounds and as it plays indicate each time the shooter wins or loses.
The program should also print out the status of the rounds they occur.
*/


}  // end of class
