import java.io.*;
import java.util.*;


public class Llist{
    private Node front; // the front of the list
    private int size; //how many items there are in the list
                      //TODO update size every time we add or delete
    public  Llist(){
	    front = null;
      size = 0;
    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
	Node newNode = new Node(data);
	// point it to what front points to
	newNode.setNext(front);
	// point front to the new node
	front = newNode;
    size++;
    }

    public String toString(){
	Node currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode + "->";
	    // this is like i=i+1 is for arrays
	    // but for linked lists
	    currentNode = currentNode.getNext();
	}
	result = result + "null";
	return result;

    }

    // returns True if there is nothing in the list
    // False otherwise
    public boolean isEmpty(){
      if(front == null){
        return true;
      }else {
        return false;
      }
      //other solution: return front == null
    }

    // returns the number of items in the list
    // Hint: look at the toString
    // to remind you how to traverse down the list
    public int length(){
	    return size;
    }

    // returns the item at location index;
    // returns null if there aren't enough
    // items. Starts with index 0
    public String get(int index){
      if(index < size) //search through list for value
      {
          Node n = front;
          int i = 0;
          while( i < index )
          {
            n = n.getNext();
            i++;
          }
          return n.getData();
      }
	    return null;

    }

    // sets the item at location index (starting
    // with 0) to value.
    // only sets if the index is within range
    /**
    Node n //new node
    Node current = //the one deleting
    Node prev = //the node before the one we're deleting
    while loop to find prev and current
    prev.setNext(n);
    n.setNext(current.getNext());
*/
    public void set(int index, String value){
      //System.out.println("index " + index + " length() " + length());
      if(index<0 || index >=length())
      {
        System.out.println("Exception index not valid.");
        return;
      }
      int i =0;
      Node m = new Node(value);
      Node currentNode =front;
      Node previousNode= null;
      while(i< index){

         previousNode=currentNode;
        /*
        if(i== index){
          currentNode.setData(value);
          break;
        }
        */
        i++;
        currentNode =currentNode.getNext();
      }
      //currentNode now points to the node at the index we want to set
      //previous node points to the node right before that index
      if(previousNode == null) //setting at position 0
	    {
		    previousNode = m;
		    front = m;
	    }
	    else
	    {
		    previousNode.setNext(m);
	    }
	    m.setNext(currentNode.getNext());

    }

    // insert an item before index.
    // only inserts if the index is within bounds
    // Hint: look at toString for hints on
    // traversal and draw out a diagram.
    // You will need a variable that refers to
    // the node BEFORE you want to do the insertion.

    //TODO update size
    public void insert(int index, String value){
    if(index<0 || index >=length())
      {
        System.out.println("We cannot insert that "+ value + " at "+ index);
        return;
      }
      int i =0;
      Node m = new Node(value);
      Node currentNode =front;
      Node previousNode= null;
      while(i< index){

         previousNode=currentNode;

        i++;
        currentNode =currentNode.getNext();
      }

      if(previousNode == null) //setting at position 0
	    {
		    previousNode = m;
		    front = m;
	    }
	    else
	    {
		    previousNode.setNext(m);
	    }
      //this method is similat to our set however instead of replacing the current node we are just inserting the node and shifting the point
	    m.setNext(currentNode);
      size ++;


    }

    // returns the index of the first item with
    // data value key. Returns -1 if not found
    public int search(String key){
      Node s= front;// not a new node, this node points to the front
      for(int i=0; i< size; i++) //loop through every element
      {
        if(s.getData().equals(key)) //the element is equal to key
        //object comparisons using .equals()
        {
          return i; //return the index i
        }
        //this will change the index at which we are comparing the string too
        s=s.getNext();
      }
	      return -1;	//return -1
    }
    // removes the node at index.


    public void remove(int index){
    //do nothing if index is out of bounds
    if(index<0 || index >=length())
      {
        System.out.println("We cannot remove from index " + index);
        return;
      }

  	  Node currentNode =front;
      Node previousNode= null;
      int i =0;

      while(i< index){

        previousNode=currentNode;
        i++;
        currentNode =currentNode.getNext();
      }

      if(previousNode == null) //setting at position 0
	    {
		    //previousNode = m;
		    //front = m;
        front = currentNode.getNext(); //to discuss
        previousNode = currentNode.getNext(); //to discuss
	    }
	    else
	    {
		    //previousNode.setNext(m);
        //bypass current node
        previousNode.setNext(currentNode.getNext()); //to discuss
	    }

  size--;
    }


}
