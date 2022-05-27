// Java program to illustrate the
// behavior of notifyAll() method

class Main extends Thread {
	public void run()
	{
		synchronized (this)
		{
			System.out.println(
				Thread.currentThread().getName()
				+ "...starts");
			try {
				this.wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
				Thread.currentThread().getName()
				+ "...notified");
		}
	}
}
class Main2 extends Thread {
	Main1 main1;
	
	Main2(Main1 main1){
	this.main1 = main1;
	}
	
	public void run()
	{
		synchronized (this.main1)
		{
			System.out.println(
				Thread.currentThread().getName()
				+ "...starts");

			try {
				this.main1.wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
				Thread.currentThread().getName()
				+ "...notified");
		}
	}
}
class Main3 extends Thread {
	Main1 main1;
	Main3(Main1 main1) { this.Main1 = main1; }
	public void run()
	{
		synchronized (this.main1)
		{
			System.out.println(
				Thread.currentThread().getName()
				+ "...starts");

			this.geeks1.notifyAll();
			System.out.println(
				Thread.currentThread().getName()
				+ "...notified");
		}
	}
}
class NotifyAll {
	public static void main(String[] args)
		throws InterruptedException
	{

		Geek1 main1= new Main1();
		Geek2 main2 = new Main2(main1);
		Geek3 main3 = new Main3(main1);
		Thread t1 = new Thread(main1, "Thread-1");
		Thread t2 = new Thread(main2, "Thread-2");
		Thread t3 = new Thread(main3, "Thread-3");
		t1.start();
		t2.start();
		Thread.sleep(100);
		t3.start();
	}
}
