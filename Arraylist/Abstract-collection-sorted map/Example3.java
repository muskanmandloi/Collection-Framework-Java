// Java program to change
// the elements in SortedMap
import java.io.*;
import java.util.*;
class Example3{
	
	// Main Method
	public static void main(String args[])
	{
		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm
			= new TreeMap<Integer, String>();

		// Inserting the Elements
		tm.put(3, "Muskan ");
		tm.put(2, "Mandloi");
		tm.put(1, "IT-2K19-34");

		System.out.println(tm);

		tm.put(2, "For");

		System.out.println(tm);
	}
}
