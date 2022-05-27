// Java program add the elements in the SortedMap
import java.io.*;
import java.util.*;
class Example2{

	// Main Method
	public static void main(String args[])
	{
		// Default Initialization of a
		// SortedMap
		SortedMap tm1 = new TreeMap();

		// Initialization of a SortedMap
		// using Generics
		SortedMap<Integer, String> tm2
			= new TreeMap<Integer, String>();

		// Inserting the Elements
		tm1.put(3, "IIPS ");
		tm1.put(2, "DAVV");
		tm1.put(1, "Indore");

		tm2.put(new Integer(3), "Muskan");
		tm2.put(new Integer(2), "Mandloi");
		tm2.put(new Integer(1), "IT-2k19-34");

		System.out.println(tm1);
		System.out.println(tm2);
	}
}
