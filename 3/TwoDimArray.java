/** skeleton file for class twoDimArray

  ...practice working with 2D arrays
  We are in !!!
*/
import java.util.*;
public class TwoDimArray
{

  //print each row of 2D integer array a on its own line,
  // using a FOR loop
  public static void print1( int[][] a ) {
     for (int i = 0; i<a.length; i++)
     {
       for(int j =0; j<a[0].length; j++)
       {
             System.out.print(a[i][j]+ "  ");
       }
     }
  }
  //print each row of 2D integer array a on its own line,
  // using a FOREACH loop
  public static void print2( int[][] a ) {

    //loop through all the rows
    for(int[] row : a){
      //loop through all the columns of the current row
      for(int elem : row) {
      System.out.print(elem + " ");
      }
      System.out.println(" ");
    }
  }

  //return sum of all items in 2D integer array a
  public static int sum1( int[][] a ) {

      int total = 0;
      int val = 0;
    for(int row =0; row <a.length; row++)
    {
      for(int col=0; col<a[0].length; col++){
            val = a[row][col];
            total=total+val;
      }
    }
     return total;
  }


  //return sum of all items on row r of 2D integer array a
  // using a FOREACH loop

  public static int sumRow2( int r, int[][] m ) {
         int total=0;
            for(int elem: m[r])
            {

                total=total+elem;
            }
      return total;
    }


  //return sum of all items in 2D integer array a
  // using helper fxn sumRow

  public static int sum2( int [][] m ) {
      int total=0;
      for(int i =0; i<m.length;i++ ){
        total= total+sumRow(i, m);
      }

           return total;
  }


  //return sum of all items on row r of 2D integer array a
  // using a FOR loop
  public static int sumRow( int r, int[][] a ) {
    int total =0;
    for(int i = 0; i<a[r].length; i++){
      total+=a[r][i];
    }
    return total;
  }



  public static void main( String [] args )
  {
       int [][] m1 = new int[10][10];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2},  {4,6}, {1,3,5} };

      print1(m1);
      print2(m2);

       print1(m2);
       print1(m3);

       print2(m1);
       print2(m2);
       print2(m3);

System.out.println("==========================");
System.out.println("==========================");
System.out.println(" ");

       System.out.print("testing sum1...\n");
       System.out.println("sum m1 : " + sum1(m1));
       System.out.println("sum m2 : " + sum1(m2));
       System.out.println("sum m3 : " + sum1(m3));
       System.out.print("testing sum2...\n");
       System.out.println("sum m1 : " + sum2(m1));
       System.out.println("sum m2 : " + sum2(m2));
       System.out.println("sum m3 : " + sum2(m3));

  }//end main()

}//end class TwoDimArray
