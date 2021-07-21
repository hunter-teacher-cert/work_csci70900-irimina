//team Daiana, Jovani, Julian
import java.io.*;
import java.util.*;

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data

    private Random r;


    public SortDemo(){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}

    }

    public SortDemo(int size){
    data = new ArrayList<Integer>();
    r = new Random();
    for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}

    }

    public int get(int index){
	return this.data.get(index);
    }

    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end
    */
    public int findSmallestIndex(int start){
	int smallIndex = start;

	// start a variable at the one after start
	// your code here

	// loop from that variable to end and update smallIndex as needed
	// your code here
	int i;
	for (i = smallIndex + 1; i < this.data.size(); i++){

	    if (this.data.get(i) < this.data.get(smallIndex)){
		smallIndex = i;
	    }

	}
	return smallIndex;
    }


    public void sort(){
	int i;
	int smallIndex;
	int tmp;
	for (i=0;i < data.size()-1; i++){
	    smallIndex = findSmallestIndex(i);
	    tmp = data.get(smallIndex);
	    data.set(smallIndex,data.get(i));
	    data.set(i,tmp);
	}
    }

    /* If you finish the lab early you can get started on this */
     /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
	    // loop through the ArrayList data
	    // and if the value you're searchign for is in the ArrayList, return it.
	    // return -1 if it isn't there.
      for (int i =0; i<data.size(); i++)
      {
        if (data.get(i)== value)
        {
          //value=data[i];
          return i;
        }
      }
	    //return 0; // replace this return
      //if value is not found
      return -1;
	}

	/* If you finish the lab early you can get started on this */
	public int binarySearch(int value){
	    return 0;

	}

    public String toString(){
	return ""+data;
    };

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order

    //if next int array a < next int array b then place next int array a in array c.
    // if next int array b < next int array a then place next int array b in array c.
    private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
         {
          //add the lists
        ArrayList<Integer> c= new ArrayList<Integer>();

           int aIndex = 0;
	         int bIndex = 0;
/*
         for(int i=0; i<a.size(); i++){
          if(a.get(i) < b.get(i)){
            c.add(a.get(i));
          }
          if(a.get(i) == b.get(i)){
            c.add(a.get(i));
            c.add(b.get(i));
          }
          if (a.get(i)>b.get(i)){
            c.add(b.get(i));
          }
         }
*/
while (aIndex < a.size() && bIndex < b.size()){
          if (a.get(aIndex) < b.get(bIndex)){
        c.add(a.get(aIndex));
        aIndex = aIndex + 1;
          } else {
        c.add(b.get(bIndex));
        bIndex = bIndex + 1;
          }
      }

      //  copy over anthing else
    // we know that either a or b will be finished
	 while (aIndex < a.size()){
	     c.add(a.get(aIndex));
	     aIndex = aIndex + 1;
	 }

	 while (bIndex < b.size()){
	     c.add(b.get(bIndex));
	     bIndex = bIndex + 1;
	 }
/*
VERSION 2
  while (!a.isEmpty() && !b.isEmpty()){
	    if (a.get(0) < b.get(0)) {
      c.add(a.get(0));
      a.remove(0);
        } else {
		// remove also returns the value so we
		// don't really need the get we used above
		c.add(b.remove(0));
	    }

	}
// copy the rest once we're at the end of one of the lists
	while (!a.isEmpty()){
	    c.add(a.remove(0));
	}
	while (!b.isEmpty()){
	    c.add(b.remove(0));
	}

  */

	return c;
	}


    private ArrayList<Integer> fillForMerge(int size)
    {
      ArrayList<Integer> a = new ArrayList<Integer>();
      int lastVal = r.nextInt(10);
      for (int i = 0 ; i < size ; i=i+1)
        {
            a.add(lastVal);
            lastVal = lastVal + r.nextInt(10);
        }
        return a;

    }
    public void testMerge(){
      ArrayList<Integer> a = new ArrayList<Integer>();
      ArrayList<Integer> b = new ArrayList<Integer>();


      a = fillForMerge(10);
      b = fillForMerge(10);

      //result= merge(a,b);
      System.out.println(a);
      System.out.println(b);

     ArrayList<Integer> result = merge(a,b);
	    System.out.println(result);

    }

  /*
  public static void mergeSort([] a, []b)
     {
       int bigList[];
       bigList= []a +[]b;

       if(current.length<2)
          return;
     }

     int mid =length/2;
     int left= new int[mid];
     int right= new int[length-mid];

     for(int i=0; int <mid; i++)
     {
       left[i]=current[i];
     }



  */

public ArrayList<Integer> msort(ArrayList<Integer> l){

	ArrayList<Integer> left = null;
	ArrayList<Integer> right = null;
  int length = l.size();
  if (length < 2){
    return l;
  }

	// base case - if the input ArrayList is smaller than 2 elements


// create arraylist sample: ArrayList<Integer> a = new ArrayList<Integer>();
	// split l into left and right halves
 int middle = length / 2 ;
 ArrayList<Integer> listLeft = new ArrayList<Integer>() ;
 ArrayList<Integer> listRight =new ArrayList<Integer>() ;
 for (int i = 0; i< middle; i++){
   listLeft.set(i,l.get(i)); //grabbing listLeft assigning utilizing l.get the index (i, x) and the values (l.get(i))
 }
  for (int i = middle; i < l.size(); i++){
    listRight.set(i,l.get(i));
  }

  msort(listLeft);
  msort(listRight);
  merge(listLeft,listRight);

  ArrayList<Integer> result = merge(left,right);
  return result;

	// sort the left half
//start at element 0 and go to mid; will not include middle

	// sort the right half
  //start at mid go to end of list; will include middle

	// merge the two halves that have been sorted

	// return the result

	//return null;
    }

    public void msortTest(){
	    data = msort(data);
    }

}
