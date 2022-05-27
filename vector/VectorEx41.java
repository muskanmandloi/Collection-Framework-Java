// Java code to illustrate the toString() method

import java.util.*;

public class VectorEx41{
	public static void main(String[] args)
	{

		// creating vector type object
		Vector<String> vector = new Vector<String>();

		// Inserting elements into the table
		vector.add("Hello");
		vector.add("World");
		vector.add("Java");


		// Displaying the Vector
		System.out.println("Vector: " + vector);

		// Displaying the string representation
		System.out.println("The String representation is: "
						+ vector.toString());
	}
}
