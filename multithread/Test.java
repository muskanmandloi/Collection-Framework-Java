// Java program Demonstrating Methods of Thread class


package generic;


class Helper implements Runnable {

	
	public void run() {

		
		try {

			System.out.println("thread2 going to sleep for 5000");

			
			Thread.sleep(5000);

		}

		
		catch (InterruptedException e) {

			
			System.out.println("Thread2 interrupted");
		}
	}
}


public class Test implements Runnable {

	
	public void run() {

		
	}

	
	public static void main(String[] args) {

		
		Test obj = new Test();
		Helper obj2 = new Helper();

		
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj2);

		
		thread1.start();
		thread2.start();

		ClassLoader loader = thread1.getContextClassLoader();

		
		Thread thread3 = new Thread(new Helper());

		
		System.out.println(Thread.activeCount());
		thread1.checkAccess();

		
		Thread t = Thread.currentThread();

		
		System.out.println(t.getName());

		System.out.println("Thread1 name: " + thread1.getName());
		System.out.println("Thread1 ID: " + thread1.getId());

		
		System.out.println("Priority of thread1 = " + thread1.getPriority());

		
		System.out.println(thread1.getState());

		thread2 = new Thread(obj2);
		thread2.start();
		thread2.interrupt();
		System.out.println("Is thread2 interrupted? " + thread2.interrupted() );
		System.out.println("Is thread2 alive? " + thread2.isAlive());

		thread1 = new Thread(obj);
		thread1.setDaemon(true);
		System.out.println("Is thread1 a daemon thread? " + thread1.isDaemon());
		System.out.println("Is thread1 interrupted? " + thread1.isInterrupted());

		
		System.out.println("thread1 waiting for thread2 to join");

		try {
			thread2.join();
		}

		catch (InterruptedException e) {

			
			e.printStackTrace();
		}

		
		thread1.setName("child thread xyz");

		
		System.out.println("New name set for thread 1" + thread1.getName());

		
		thread1.setPriority(5);

		thread2.yield();

		
		System.out.println(thread1.toString());

		
		Thread[] tarray = new Thread[3];

		Thread.enumerate(tarray);

		
		System.out.println("List of active threads:");
		System.out.printf("[");

		
		for (Thread thread : tarray) {

			System.out.println(thread);
		}

		
		System.out.printf("]\n");

		System.out.println(Thread.getAllStackTraces());

		ClassLoader classLoader = thread1.getContextClassLoader();
		System.out.println(classLoader.toString());
		System.out.println(thread1.getDefaultUncaughtExceptionHandler());

		thread2.setUncaughtExceptionHandler(thread1.getDefaultUncaughtExceptionHandler());
		thread1.setContextClassLoader(thread2.getContextClassLoader());
		thread1.setDefaultUncaughtExceptionHandler(thread2.getUncaughtExceptionHandler());

		thread1 = new Thread(obj);
		StackTraceElement[] trace = thread1.getStackTrace();

		System.out.println("Printing stack trace elements for thread1:");

		for (StackTraceElement e : trace) {
			System.out.println(e);
		}

		ThreadGroup grp = thread1.getThreadGroup();
		System.out.println("ThreadGroup to which thread1 belongs " + grp.toString());
		System.out.println(thread1.getUncaughtExceptionHandler());
		System.out.println("Does thread1 holds Lock? " + thread1.holdsLock(obj2));


		Thread.dumpStack();

	}
}
