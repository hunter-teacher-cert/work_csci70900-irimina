import java.io.*;
import java.util.*;

public class TreeNode{
  //three components
    private int data; // sutff: HR records, names, etc
    private TreeNode left,right;

//constructor 1
    public TreeNode(){
  	this(0);  // data = 0;
  	left = null; // we'll set them later
  	right = null;
    }
//construct 2
    public TreeNode(int data){
  	this.data = data;
  	left = null;
  	right = null;
    }

// first part done before testing
//next getters and setters

    public void setData(int data){
    	this.data = data;
        }

        public void setLeft(TreeNode left){
    	this.left = left;
        }

        public void setRight(TreeNode right){
    	this.right = right;
        }

        public int getData(){
    	     return data;
        }

        public TreeNode getLeft(){
    	return left;
        }

        public TreeNode getRight(){
    	return right;
        }
    //end of part 1

}
