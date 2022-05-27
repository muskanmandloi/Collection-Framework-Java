import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class arrayblockingdequecreate {

    public static void main(String[] args)
    {
        // Define capacity of ArrayBlockingQueue
        int capacity = 5;

        // Create object of ArrayBlockingQueue
ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);

        // Add 5 elements to ArrayBlockingQueue
queue.offer("MUSKAN MANDLOI");
queue.offer("IIPS DAVV");
queue.offer("IT-2K19-34");
queue.offer("JAVA");
queue.offer("ADVANCE");

        // Print queue
System.out.println("Queue is " + queue);

        // Call iterator() method and Create an iterator
        Iterator iteratorValues = queue.iterator();

        // Print elements of iterator
System.out.println("\nThe values:");
        while (iteratorValues.hasNext()) {
System.out.println(iteratorValues.next());
        }
    }
}

