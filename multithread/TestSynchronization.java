package thread7;
class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table obj=new Table();
		Thread t1=new Thread() {
		public void run() {
			obj.printTable(5);
		}

	};
	Thread t2=new Thread() {
	public void run() {
		obj.printTable(100);
	}
};
	t1.start();
	t2.start();

}
}
