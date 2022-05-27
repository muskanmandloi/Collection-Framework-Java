// Iterating over concurrentlinkedqueue

import java.util.concurrent.*;
import java.util.*;

public class iterateconcurentdeque {

    public static void main(String[] args)
    {
        // Create an instance of ConcurrentLinkedQueue
ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();

        // Add String to queue using add(e) method
queue.add("Muskan");
queue.add("Mandloi");
queue.add("IT-2K19-34");
queue.add("JAVA_ASSIGNMENT");

        // Displaying the existing ConcurrentLinkedQueue
System.out.println("ConcurrentLinkedQueue : " + queue);

        // Call iterator() method
        Iterator iterator = queue.iterator();

        // Print elements of iterator
System.out.println("\nThe String Values of iterator are:");
        while (iterator.hasNext()) {
System.out.println(iterator.next());
        }
    }
}
