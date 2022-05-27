import java.util.*;  
public class IdentityHashMapExample2 {  
    public static void main(String[] args)  
    {  
        // Creating an empty IdentityHashMap  
        Map<Integer, String> object_ihm  
            = new IdentityHashMap<Integer, String>();  
        // adding key and value pairs  
        // mapping String values to integer keys  
        object_ihm.put(1, "Hello");  
        object_ihm.put(2, "How");  
        object_ihm.put(3, "Are");  
        object_ihm.put(4, "You");  
        object_ihm.put(5, "?");  
        // displaying the IdentityHashMap  
        System.out.println("The initial mappings are: "  
                           + object_ihm);  
        // removing the existing key-value mapping  
        String returned_value = (String)object_ihm.remove(3);   
        // Displaying the new IdentityHashMap  
        System.out.println("\nThe new IdentityHashMap is: "  
                           + object_ihm);  
    }  
}  
