
// Adding elements to concurrentlinkedqueue

import java.util.concurrent.*;
import java.util.*;

public class concurrentlinkedqueuedemo {

    public static void main(String[] args)
    {

        // Create an instance of ConcurrentLinkedQueue
ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();

        // Add String to queue using add method
queue.add("Kolkata");
queue.add("Patna");
queue.add("Delhi");
queue.add("Jammu");

        // Displaying the existing ConcurrentLinkedQueue
System.out.println("ConcurrentLinkedQueue: " + queue);

        // create a ArrayList of Strings
ArrayList<String>arraylist = new ArrayList<String>();

        // add String to ArrayList
arraylist.add("Sanjeet");
arraylist.add("Rabi");
arraylist.add("Debasis");
arraylist.add("Raunak");
arraylist.add("Mahesh");

        // Displaying the existing Collection
System.out.println("Collection to be added: " + arraylist);

        // apply addAll() method and passed
        // the arraylist as parameter
boolean response = queue.addAll(arraylist);

        // Displaying the existing ConcurrentLinkedQueue
System.out.println("Collection added: " + response);

        // Displaying the existing ConcurrentLinkedQueue
System.out.println("ConcurrentLinkedQueue: " + queue);
    }
}
