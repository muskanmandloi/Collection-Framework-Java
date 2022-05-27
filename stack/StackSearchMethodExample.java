import java.util.Stack;  
public class StackSearchMethodExample  
{  
public static void main(String[] args)   
{  
Stack<String> stk= new Stack<String>();  
//pushing elements into Stack  
stk.push("Hello");  
stk.push("World");  
stk.push("Java");  
System.out.println("Stack: " + stk);  
// Search an element  
int location = stk.search("Eclipse");  
System.out.println("Location of Java: " + location);  
}  
}  