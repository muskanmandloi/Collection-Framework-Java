import java.util.*;
public class indexoflinklist {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    //to add an element in the list
    list.add(80);
    list.add(22);
    list.add(36);
    list.add(34);
    list.add(92);
    list.add(03);

    System.out.println("Elements in the list are :");
    for (Integer integer : list) {
        System.out.println(integer);
    }
//indexof method    
    System.out.println("76 is at "+list.indexOf(76)+" index");
 //get method
    System.out.println("Element at 3 positon  is "+list.get(3));
//last Index of an element 
    System.out.println("Last index of 12 is "+list.lastIndexOf(12));

    }
}
