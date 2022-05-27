import java.util.EnumSet;
import java.util.Iterator;


public class acessenumelements {
    

    enum info {
        IIPS,DAVV,Java_Assignment,Muskan ,Mandloi
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<info> i = EnumSet.allOf(info.class);

        Iterator<info> iterate = i.iterator();

        System.out.print("EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }



    
}

