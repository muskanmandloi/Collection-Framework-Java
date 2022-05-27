
import java.util.*;

class navigablemapmethods {
	public static void main(String args[])
	{

		
		NavigableMap<Integer, String> nmap
			= new TreeMap<Integer, String>();

	
		nmap.put(1, "MUSKAN MANDLOI");
		nmap.put(3, "IT-2K19-34");
		nmap.put(2, "JAVA_ASSIGNMENT");

		
		System.out.println("Mappings of NavigableMap : "
						+ nmap);

                     
        nmap.remove(4);
 
       
        System.out.println(
            "\nNavigableMap, after remove operation : "
            + nmap);
 
      
        nmap.clear();
        System.out.println(
            "\nNavigableMap, after clear operation : "
            + nmap);

	}
}
