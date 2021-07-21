// team: Daiana, Jovani and Julian
//goal. What does the program aim to acomplish?

import java.io.*;
import java.util.*;

public class Time {
  private int hour, minute, second ;
// created an object named Time with int variables
  public Time()
  {
   this.hour= 0;
   this.minute= 0;
   this.second= 0;
  }

public Time(int hr,int min, int sec){
  this.hour= hr;
  this.minute= min;
  this.second=sec;

}

public int getHour(){
  return this.hour;
}
public int getMinute(){
  return this.minute;
}
public int getSecond(){
  return this.second;
}


public void setHour(int hour) {
    this.hour = hour;
}
public void setMinute(int minute) {
    this.minute = minute;
}
public void setSecond(int second) {
    this.second = second;
}

public String toString() {
    return ("Hour:"+ hour+ " Minute:"+ minute+ " Seconds:" + second);
  }

/*
public static void printTime (Time t) {
  System.out.println(t.hour);
  System.out.print(" : ");
  System.out.println(t.minute);
  System.out.print(" : ");
  System.out.println(t.second);
  System.out.println(t);
}
*/

/*
public boolean equals(Object obj)
{
 if (obj == this)
 {
   return true;
 }
 return false;

}
*/



}//end class.
