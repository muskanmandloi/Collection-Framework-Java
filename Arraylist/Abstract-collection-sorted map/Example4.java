// Java program to remove the
// elements from SortedMap
import java.io.*;
import java.util.*;

class Example4 {
	
	// Main Method
	public static void main(String args[])
	{
		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm
			= new TreeMap<Integer, String>();

		// Inserting the Elements
		tm.put(3, "Java");
		tm.put(2, "PHP");
		tm.put(1, "ADA");
		tm.put(4, "Web Tech");

		System.out.println(tm);

		tm.remove(4);

		System.out.println(tm);
	}
}
