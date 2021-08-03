import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	     root = null;
    }

    public void seed(){
    	TreeNode t;

      //t has the value 10
    	t = new TreeNode(10);

      //root point to t
    	root = t;

    	t = new TreeNode(5);

      //t is on the left side
    	root.setLeft(t);

    	t = new TreeNode(20);

        //t is on the right side
    	root.setRight(t);

      // on the left side of the tree, create a new node to the right
    	root.getLeft().setRight( new TreeNode(8));

    	t = new TreeNode(15);

      // add a node on the right side of the root and to the left
    	root.getRight().setLeft(t);

	     t = new TreeNode(22);

      // add a node on the right side of the root and to the right
    	root.getRight().setRight(t);

	}

    // ===================== end of PART 1

    public int search(int key){
      //current is a temporary node, we don't want to move the root
      // is it necessary?
   	TreeNode current = root;

   	while (current !=null /* what goes here when doyou want to stop */){
// same as the next line, #54 54 z    current.getValue() ==key
   	    int currentValue = current.getData(); // currentValue is the current value we compare key to
   	    if (currentValue == key){
   	    	// do something
          return currentValue; //this is the key
   	    } else if (currentValue < key){
          current = current.getRight();
   		// do something else
   	    } else {
   		// do yet another thing
        current = current.getLeft();
   		}
   	}
   	// do we really want to return -1?
    //return -1
   	throw new NullPointerException();
       }

  // =============== end of PART 2 search routine

  public void insert(int key){
    //front is a temporary node, we don't want to move the root
    // this is the pointer we use at the front of our traversal
      TreeNode front = root;

      TreeNode newNode= new TreeNode(key); // new node with a value of key
      //if the tree is empty, manually insert the new node as the root
      // it is like a base case beca
      if(root==null)
      {
        root=newNode;
        return;
      }

      //trailer is the pointer
    	TreeNode trailer=root; // start at null
      while (front != null){
      	    int frontValue = front.getData();
      	    if (frontValue == key){
      		// if we're here, it means the key is
      		// already in the tree so we can
      		// update this node in some way
      		// and then return
      		return;
      	    } else if (frontValue < key){
          // trailer catches up to the front and the front moves to the next one
          //trailer points to the node before;
      		trailer = front;
      		front = front.getRight();
      	    } else {
      		trailer = front;
      		front = front.getLeft();
      	    }
        /*
     at this point, front points to null but trailer points to the node
     that's before where the new node goes
        */
      	}
        // different than video aound .36
      	if (key > trailer.getData()){
      	    // insert on the right
      	    trailer.setRight(newNode);
      	} else {
      	    // insert on left
      	    trailer.setLeft(newNode);
      	}
    }

    // =============== end of PART 3 insert routine

    private void preorderTraverse(TreeNode current){
	     if (current == null)
	      return;

    	//process the current node
    	System.out.print(current.getData()+", ");

    	// recursively print out the left subtree
    	preorderTraverse(current.getLeft());

    	// recursively print out the right subtree
    	preorderTraverse(current.getRight());
        }

    public void preorderTraverse(){
      	preorderTraverse(root);
      	System.out.println();
        }



    private void postorderTraverse(TreeNode current){
    	if (current == null)
    	    return;

        	// recursively print out the left subtree
        	postorderTraverse(current.getLeft());

        	// recursively print out the right subtree
        	postorderTraverse(current.getRight());

        	//process the current node
        	System.out.print(current.getData()+", ");

    }
    public void postorderTraverse(){
      	postorderTraverse(root);
      	System.out.println();
          }

    private void inorderTraverse(TreeNode current){
      	if (current == null)
      	    return;

      	// recursively print out the left subtree
      	inorderTraverse(current.getLeft());

      	//process the current node
      	System.out.print(current.getData()+", ");

      	// recursively print out the right subtree
      	inorderTraverse(current.getRight());
          }

        public void inorderTraverse(){
        	inorderTraverse(root);
        	System.out.println();
          }
// =============== end of PART 4 traversal routine

public void delete(int key){

	// if the tree is empty, nothing to delete
	if (root==null){
	    return;
	}
	// find the node that we want to delete
	// and the node above it using piggybacking
	TreeNode front = root;
	TreeNode trailer = root;

	// do the piggyback loop
	// until we either find the node or null
	// if the key isn't found
	while (front != null && front.getData() != key ){
	    if (front.getData() < key){
    		trailer = front;
    		front = front.getRight();
    	    } else {
    		trailer = front;
    		front = front.getLeft();
	    }
	}

	// if the key wasn't in the tree
	if (front == null){
	    return;
	}
	// if we get here
	// front points to the node we want to delete
	// and trailer points to the one above it

	// case 1 -- delete a leaf, the node we want to delete is a leaf
	if (front.getLeft() == null && front.getRight() == null)
      {
        // repoint front's parent to null
          if(front.getData()<trailer.getData()) //move on the left
          {
            trailer.setLeft(null);
          }
          else
          {
            trailer.setRight(null);
          }
      } else if (true)
/* case 2 check to see if front has one child */

    {
	    // repoint front's parent to front's child
	   } else {
       // case 3 front has two children
       // find the node with the largest value
       // on fronts left subtree
       // and replace front with it.

    //delete a node with 2 children; look for smallest node on the right subtree
    // keep going left

    TreeNode smallest = front.getRight();
    TreeNode smallestParent = front;

    while(smallest.getLeft() !=null)
    {
      smallestParent= smallest;
      smallest = smallest.getLeft();
    }

    int newInfo= smallest.getData();
    delete(smallest.getData());
    front.setData(newInfo);



	    }
	} // end delete
// =============== end of PART 5, delete routine

}
