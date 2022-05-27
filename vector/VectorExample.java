import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          //Adding elements using add() method of List  
          vec.add("Tiger");  
          vec.add("Lion");
Vector<String> vec1 = new Vector<String>();  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
         
          System.out.println("Elements are: "+vec);  
vec.addAll(vec1);
   System.out.println("new vector is: "+vec);  
       }  
}  
