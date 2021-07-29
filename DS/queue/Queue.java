//group  benson, julian,stephannia
import java.io.*;
import java.util.*;

public class Queue {
  private Node head;
  private int count;
  private Node tail;
  private String data;

  public Queue(){
    head=null;
    count=0;
    tail=null;
    data = "";
  }//default constructor

/*  public Queue(String value) {
    data = value;
    head = null;
    count = 0;
    tail = null;
  }//constructor(value)*/

  //are the items in the queue?
  //TODO:create a private int to keep track of size

  //returns true if the queue is empty
  public boolean isEmpty(){
    if(head == null){
      return true;
    }else {
      return false;
    }

  }//end isEmpty

  //add value to the back/tail of the linked list
  public void enqueue(String data){
    //created a new node to hold the data value
    Node node = new Node(data);
    //if tails is not null, we are going to add the value to the tail end of the list otherwise we bypass this step
    if (tail != null){
      tail.setNext(node);
    }
    //we then set the tail to the new node that is being added into the list
    tail = node;
    //then if the list is empty the tail will now become the head of the list. because it is FIFO
    if (head == null){
      head = node;
    }
    count++;

  }//end enqueue

  // return the item at the front/head without removing it
  public String front(){
    return head.getData();
  }//end front


  //remove and return the value at the front/head of the queue
  public void dequeue(){
    //we need to repoint the head to the one behind it
    //if tail = null ( if the queue is empty) then were going to let the user know that there nothing in the queue.
    //if you try to remove more than whats in the list
    if(tail == null){
      System.out.println("The Queue is empty");
      count=0;
    }
    //if that statement is false, then were going to changer pointer which results the head being nulll, and changing tail to be null.
    else{
      head = head.getNext();
      if(head == null){
        tail = null;
        count--;
      }
        //count--;
    }

    }//end dequeue



  //returns number of items in the queue
  public int size(){
    return count;
  }//end size

  public String toString(){
    Node currentNode;
    currentNode = head;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + " <- ";
      // this is like i=i+1 is for arrays
      // but for linked lists
      currentNode = currentNode.getNext();
    }
    result = result + "tail";
    return result;

  }


}//end class
