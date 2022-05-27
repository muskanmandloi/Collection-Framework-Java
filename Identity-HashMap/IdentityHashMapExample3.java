import java.util.*;    
public class IdentityHashMapExample3 {      
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
        // accessing the value of 5  
        System.out.println("Value of key 5 is:"  
                           + object_ihm.get(5));  
        // accessing the value of 2  
        System.out.println("Value of key 2 is:"  
                           + object_ihm.get(2));  
        // getting the set view of keys using keySet()  
        System.out.println("Set view of keys: "  
                           + object_ihm.keySet());  
        // getting the set view using entrySet()  
        System.out.println("The set is: "  
                           + object_ihm.entrySet());  
    }  
}  
