import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

    //Initialize a new Mode using the default constructor
    Mode m = new Mode();
    //long start,elapsed;
    int mode;

    //Mode m = new Mode(100000);
    //start = System.currentTimeMillis();
    mode = m.calcMode();
    System.out.println(m);

    System.out.println("The mode is "+ mode);

    //elapsed = System.currentTimeMillis()-start;
    //System.out.println(elapsed);
    //System.out.println(" ");

    //System.out.println("Print out mode m: ");
  	//System.out.println(m);

    System.out.println("Test findSmallestValue():");
    System.out.println(m.findSmallestValue());

    System.out.println("Test frequency(0):");
    System.out.println(m.frequency(0));

    System.out.println("Test frequency(1):");
    System.out.println(m.frequency(1));

    System.out.println("Test frequency(2):");
    System.out.println(m.frequency(2));

    System.out.println("Test calcMode():");
    System.out.println(m.calcMode());


/*
------------------------------------------------------
Test timing
*/

    //long start, elapsed;
    //int size;

    //size = 200000;
    // SortDemo sds = new SortDemo(size);
    // start = System.currentTimeMillis();
    // sds.sort();
    // elapsed = System.currentTimeMillis() - start;
    // System.out.println("Selection on size " + size + " : " + elapsed);

/*
    Mode mode2 = new Mode(size);
    start = System.currentTimeMillis();
  //  mode2.msortTest();
    elapsed = System.currentTimeMillis() - start;
    System.out.println("Selection on size " + size + " : " + elapsed);

    Mode mode3 = new Mode(size);
    start = System.currentTimeMillis();
    //sdb.builtinSort();
    elapsed = System.currentTimeMillis() - start;
    System.out.println("Selection on size " + size + " : " + elapsed);
*/
  }

}
