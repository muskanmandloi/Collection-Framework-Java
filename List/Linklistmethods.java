import java.util.LinkedList;
public class Linklistmethods {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
   
    list.add(90);
    list.add(12);
    list.add(76);
    list.add(34);
    list.add(12);
   list.add(23);

    System.out.println("Elements in the list are :");
    for (Integer integer : list) {
        System.out.println(integer);
    }

    


System.out.println("Element at index 3  removed form the list :");
list.remove(3);

System.out.println("Element at index 2 is set to 98");
list.set(2, 98);
for (Integer integer : list) {
    System.out.println(integer);
}


System.out.println("First element of the list is :"+list.getFirst());
System.out.println("Last  element of the list is :"+list.getLast());
}
}
