// team: jovani, daiana and julian

import java.io.*;
import java.util.*;

/*
fib(0) -> 0
fib(1) -> 1
fib(2) -> 1
fib(3) -> 2
fib(4) -> 3
fib(5) -> 5

*/

public class Fib{
  public static void main (String[] args){
  System.out.println(fib(2));
   System.out.println(fib(3));
    System.out.println(fib(4));

  }

    public static int fib (int a){
    if (a==0){
      return 0;
    }
    else if (a ==1 || a ==2){
      return 1;
    } else {
      return fib(a-1)+ fib(a-2);
  }
  }

}//end class Fi
