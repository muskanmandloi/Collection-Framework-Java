
// banking transaction
class Bank {

	
	int total = 100;

	
	void withdrawn(String name, int withdrawal)
	{
		if (total >= withdrawal) {
			System.out.println(name + " withdrawn "
							+ withdrawal);

			total = total - withdrawal;
			System.out.println("Balance after withdrawal: "
							+ total);
			

			
			try {

				// Making thread t osleep for 1 second
				Thread.sleep(1000);
			}

			
			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		
		else {

			// Print statement
			System.out.println(name+ " you can not withdraw "+ withdrawal);

			System.out.println("your balance is: " + total);

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	
	void deposit(String name, int deposit)
	{
		System.out.println(name + " deposited " + deposit);
		total = total + deposit;
		System.out.println("Balance after deposit: "
						+ total);
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadBank
 {


	public static void main(String[] args)
	{
		

		
		Bank obj = new Bank();

		// Custom input - Transactions
		obj.withdrawn("muskan", 20);
		obj.withdrawn("namarta", 40);
		obj.deposit("pallavi", 35);
		obj.withdrawn("Riya", 80);
		obj.withdrawn("shubhi", 40);
	}
}
