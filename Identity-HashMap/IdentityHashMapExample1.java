import java.util.*;  
public class IdentityHashMapExample1 {  
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
        // inserting existing key along with new value  
        // the old value is stored in variable old_value  
        String old_value  
            = (String)object_ihm.put(1, "Heyyy");  
        // verifying the old returned value  
        System.out.println("\nReturned value is: "  
                           + old_value);  
        // displaying the new map  
        System.out.println("\nIdentityHashMap after changing the value to existing key:\n " + object_ihm);  
        // creating a new Identityhash map and copying using putAll()  
        Map<Integer, String> newnew_IdentityhashMap  
            = new IdentityHashMap<Integer, String>();  
        new_IdentityhashMap.putAll(object_ihm);  
        // Displaying the final IdentityHashMap  
        System.out.println("\nThe new IdentityHashMap (copied): "  
                           + new_IdentityhashMap);  
    }  
}  