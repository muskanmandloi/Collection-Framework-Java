import java.util.EnumSet;
public class Enumsetsize{
    
        enum Size {
            SMALL, MEDIUM, LARGE, EXTRALARGE
        }
        
        public static void main(String[] args) {
    
            // Creating an EnumSet using allOf()
            EnumSet<Size> sizes = EnumSet.allOf(Size.class);
    
            System.out.println("EnumSet: " + sizes);
        }
    
    }
