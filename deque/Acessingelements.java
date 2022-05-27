
// .Accessing elements of concurrentlinkedqueue

import java.util.*;
import java.util.concurrent.*;

public class Acessingelements {

    public static void main(String[] args) throws IllegalStateException
    {
        // Create an instance of ConcurrentLinkedQueue
ConcurrentLinkedQueue<Integer> Q = new ConcurrentLinkedQueue<Integer>();

        // Add numbers to end of Queue
Q.add(7855642);
Q.add(35658786);
Q.add(5278367);
Q.add(74381793);

        // print queue
System.out.println("Queue: " + Q);

        // print head
System.out.println("Queue's head: " + Q.element());

        // print head
System.out.println("Queue's head: " + Q.peek());
    }
}
