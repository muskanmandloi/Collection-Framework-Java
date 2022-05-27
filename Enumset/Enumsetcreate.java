import java.util.*;
enum games{chess,ludo,snakeladder,carrace};
public class Enumsetcreate{
    public static void main(String[] args) {
        
    EnumSet<games> eset1 , eset2,eset3;
    eset1 = EnumSet.of(games.chess,games.ludo);
    eset2 = EnumSet.of(games.ludo);
    eset3 = EnumSet.of(games.carrace,games.snakeladder);
    System.out.println("Set 1: " + eset1);  
    System.out.println("Set 2: " + eset2);  
    System.out.println("Set 3: " + eset3);    
}
}