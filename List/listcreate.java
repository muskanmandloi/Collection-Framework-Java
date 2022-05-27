import java.util.*;
public class listcreate{
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
   
    list.add(90);
    list.add(98);
    list.add(76);
    list.add(34);
    list.add(12);
    System.out.println("Elements in the list are :");
    for (Integer integer : list) {
        System.out.println(integer);
        
    }
    
    Scanner scn = new Scanner(System.in);
    System.out.println("Where do you want to add an element and at which position:");
    int i = scn.nextInt();
    int e = scn.nextInt();
    
    list.add(i, e);

    for (Integer integer : list) {
        System.out.println(integer);
        
    }
   }
}