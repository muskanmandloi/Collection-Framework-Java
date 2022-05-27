package generic;
import java.util.*;

public class generic {
	private Object t;

	public Object get() {
		return t;
	}


	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		generic type = new generic();
		type.set("muskan"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
	}
}
