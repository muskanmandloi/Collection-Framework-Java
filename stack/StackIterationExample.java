import java.util.Iterator;  
import java.util.Stack;  
public class StackIterationExample  
{     
public static void main (String[] args)   
{   
//creating an object of Stack class  
Stack stk = new Stack();  
//pushing elements into stack  
stk.push("Red");  
stk.push("Green");  
stk.push("Black");  
stk.push("Purple");  
  
//iteration over the stack  
Iterator iterator = stk.iterator();  
while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
}     
}  
}  