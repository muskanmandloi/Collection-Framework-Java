

import java.util.*;
import java.util.AbstractCollection;

public class Abstract{
	public static void main(String[] args)
	{
		
		AbstractCollection<Object>
			abs = new ArrayList<Object>();

		
		abs.add("Welcome");
		abs.add("To");
		abs.add("IIPS DAVV");
		abs.add("IT-2K19-34");
		abs.add("Muskan Mandloi");

		// Displaying the Collection
		System.out.println("AbstractCollection: "
						+ abs);
	}
}
