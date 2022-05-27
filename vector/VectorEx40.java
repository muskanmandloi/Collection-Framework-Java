// Java Program to Illustrate clone() method of Vector class

// Importing required classes
import java.util.*;

// Main class
// VectorDemo
public class VectorEx40{

	// Main driver method
	public static void main(String args[])
	{

		// Creating an empty Vector by creating object
		// of vector class of string type
		Vector<String> vec_tor = new Vector<String>();

		// Adding custom input elements into the vector
		// using add() method
		vec_tor.add("Welcome");
		vec_tor.add("To");
		vec_tor.add("IIPS");
		vec_tor.add("For");
		vec_tor.add("Bright Future");

		// Print and display all vector elements
		System.out.println("Vector: " + vec_tor);

		// Creating another vector to copy by
		// creating an object of Object class
		Object copy_vector = vec_tor.clone();

		// Print and display the cloned vector elements
		System.out.println("The cloned vector is: "
						+ copy_vector);
	}
}
