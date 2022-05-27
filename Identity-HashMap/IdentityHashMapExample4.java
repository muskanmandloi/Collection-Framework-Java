
import java.util.*;  
public class IdentityHashMapExample4 {  
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
        // creating an Iterator to traverse over IdentityHashMap  
        Iterator<IdentityHashMap.Entry<Integer, String> >  
        itr = object_ihm.entrySet().iterator();  
        // hasNext() method is used to check if there is a next element   
        //The next() method is used to retrieve the next element  
        while (itr.hasNext()) {  
            IdentityHashMap.Entry<Integer, String> entry  
                = itr.next();  
            System.out.println("Key : " + entry.getKey()  
                               + ", Value : "  
                               + entry.getValue());  
        }  
    }  
}   