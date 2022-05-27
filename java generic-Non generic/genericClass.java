package generic;



public class genericClass<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		genericClass<String> type = new genericClass<String>();
		type.set("Pankaj"); //valid
		
		genericClass type1 = new genericClass(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
	}
}
