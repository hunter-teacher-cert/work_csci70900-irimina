import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	  BSTree t = new BSTree();
  //end of part 1

  //   t.seed();
/*
  		int value;
  		value = t.search(10);
  		System.out.println(value);
  		value = t.search(15);
  		System.out.println(value);
  		try {
  			value = t.search(17);
  			System.out.println(value);
  		} catch (NullPointerException e) {
  			System.out.println("17 not in tree");
  		}
*/
// end of part 2, search
       t.insert(10);
       t.insert(20);
    		t.insert(5);
    		t.insert(7);
    		t.insert(8);
    		t.insert(3);
    		t.insert(25);

// end of part 3 insert

    	System.out.println("Preorder: ");
    t.preorderTraverse();
      	System.out.println("Postorder: ");
    t.postorderTraverse();
      	System.out.println("Inorder: ");
    t.inorderTraverse();

// end of part 4 traversal



// end  of delete

    }
}
