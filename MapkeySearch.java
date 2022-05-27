import java.util.*;
 class MapkeySearch {
public static void main(String[] args) {
    Map<Integer,String> m = new HashMap<Integer, String>();
    m.put(1, "Tea");
    m.put(2, "coffe");
    m.put(3, "juice");
    m.put(4, "soup");
    
    System.out.println("Map is:"+m);
    boolean flag = m.containsKey(1);
    System.out.println("Key 1 exists in Map? : " + flag);
 
    boolean flag2 = m.containsKey(55);
    System.out.println("Key 55 exists in Map? : " + flag2);
 
    boolean flag3 = m.containsKey(4);
    System.out.println("Key 4 exists in Map? : " + flag3);

    
}
}
