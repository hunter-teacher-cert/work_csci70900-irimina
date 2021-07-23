import java.io.*;
import java.util.*;



public class Mode{
  private ArrayList<Integer> inputData;
  private Random r;

  public Mode(){
    r = new Random();
    inputData = new ArrayList<Integer>();

    for (int i=0; i < 20; i++){
      inputData.add(r.nextInt(20)); //random number 0 - 19
    }
  }

  public Mode(int size){
    r = new Random();
    inputData = new ArrayList<Integer>();

    for (int i=0; i < size; i++){
      inputData.add(r.nextInt(50)); //random number 0 - 49
    }
  }

  /**
  * Warmup 1
  Find and return the smallest value in InputData.
  */

  public int findSmallestValue(){

    //Initialize a smallestValue variable to store the smallest value in InputData
    int smallestValue = inputData.get(0);

    for (int i = 1; i < inputData.size(); i++){
      if (inputData.get(i) < smallestValue) { //If the current value is less than smallestValue...
        smallestValue = inputData.get(i); //...set smallestValue to the new value
      }
    }

    return smallestValue;
  }

  /**
  * Warmup 2
  Returns the frequency of value in inputData, that is, how often value appears
  */
  public int frequency(int value){

    //Initialize a count variable to store the frequency
    int count = 0;

    //Iterate through the ArrayList to find the frequency of "value"
    for(int i = 0; i < inputData.size(); i++) {
      if (inputData.get(i) == value) { //If value is found...
        count++; //...increment count
      }
    }

    return count;
  }

  /**
  *
  This function should calculate and return the mode of inputData.
  The mode is the value that appears most frequently so if inputData contained
  5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times.
  If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
  either of them (the 5 or the 9).
  Note: you will probably use the frequency function you wrote in
  this solution but not findSmallestValue. the findSmallestValue
  function will help you find a strategy for approaching finding the mode.
  */
  public int calcMode(){

    //Initialize a count variable to store the mode
    int modeCount = 0;
    int modeValue = 0;

    //Iterate through the ArrayList to find the frequency of each value
    //version 1
    /*
    for(int i = 0; i < inputData.size(); i++) {
      int count = 0; //initialize a count variable to 0
      int value = inputData.get(i); //initialize value to element at i
      for(int j = 0; j < inputData.size(); j++) {
        if (inputData.get(j) == value){ //If value is found...
          count++; //...increment count
        }
      }
        //If the current count is greater than the modeCount...
        if (count > modeCount){
          modeCount = count; //...update modeCount
          modeValue = value; //...update modeValue
        }
      }

    //Return the mode
    return modeValue;
  }

*/

  //VERSION 2   ``
  	    int modeSoFar = inputData.get(0);
  	    int countSoFar = frequency(modeSoFar);
  	    for (int i=0 ; i < inputData.size() ; i++){
      		int f = frequency(inputData.get(i));
      		if (f>countSoFar){
    		    countSoFar = f;
    		    modeSoFar = inputData.get(i);
  		   }
  	    }

  	    return modeSoFar;
  	}


  public String toString(){
    return ""+inputData;
  }
}
