
// team: Daiana, Jovani and Julian
import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;

    //assign var the address of a newly-apportioned Time object
    t = new Time();

    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter the current hour:");
    int hr = keyboard.nextInt();

    System.out.println("Enter the current minute:");
    int min = keyboard.nextInt();

    System.out.println("Enter the current second fast:");
    int sec= keyboard.nextInt();

    keyboard.close();

    t.setHour(hr);
    t.setMinute(min);
    t.setSecond(sec);

    System.out.println("First object named t");
    System.out.println(t);
    System.out.println(" ");

   //new objects
    Time t1= new Time();
    // object with no setters and no arguments
    System.out.println("Second object named t1");
    System.out.println (t1);
    System.out.println(" ");

    Time t2 = new Time(5,20,25);
    //object with arguments provided
    System.out.println("Third object named t2");
    System.out.println (t2);

    //assign a Time var the value null
    Time t3;
    //defines a reference t3 that is uninitialized ( there ore no new operator and no constructor)
    t3=null;


    //test for equality of each of the Time instances above. Print results.
    // equals() checks the reference and not the values?
    //reason why the output is false

    System.out.println(" ");
  System.out.println("Are objects t and t1 the same? " + t.equals(t1));
  System.out.println("Are objects t1 and t2 the same? " + t1.equals(t2));

    //add two Time objects and print results



    //add two Time objects and save the result in another Time object


  }//end main()


}//end class
