package synchronization;
import java.util.*;
class Table2{
	void printTable(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
	class MyThread1 extends Thread{
		Table2 t;
		MyThread1(Table2 t){
			this.t=t;
		}
		public void run() {
			t.printTable(5);
		}
		
	}
	class MyThread2 extends Thread{
		Table2 t;
		MyThread2(Table2 t){
		this.t=t;
		}
	public void run() {
		t.printTable(100);
	}

}
public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table2 obj=new Table2();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2 =new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
