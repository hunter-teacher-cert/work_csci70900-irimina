import java.io.*;
import java.util.*;

public class QDriver{
  public static void main(String[] args) {
    Queue n = new Queue();
    System.out.println(n.isEmpty());
    n.enqueue("ian");
    System.out.println(n.front());
    n.enqueue("Julian");
    n.enqueue("steph");
    System.out.println(n.size());
    System.out.println(n.isEmpty());
    System.out.println(n);
    n.dequeue();
    System.out.println(n);
    n.dequeue();
    System.out.println(n);
    n.dequeue();
    System.out.println(n);
    n.dequeue();
    System.out.println(n);
    System.out.println(n.isEmpty());
    n.enqueue("Julian");
    n.enqueue("steph");
    n.enqueue("Benson");
    n.enqueue("Vick");
    n.enqueue("ian");
    n.enqueue("peter");
    System.out.println(n.size());
    System.out.println(n);
    System.out.println(n.front());

  }//end of main
}//end of QDriver
