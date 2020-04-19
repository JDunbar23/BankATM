import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj1 = new BankAccount("XYZ", "1234"); // Creates new class object with customerName and customerID
		obj1.ShowMenu(); // Runs the ShowMenu function in the BankAccount class

	}

}


class BankAccount
{
	
	// Set the variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	
	// Creates constructor
	BankAccount(String cname, String cid)
	{
		
		customerName = cname;
		customerID = cid;
	}
	
	
	void deposit(int amount) // Creates the deposit method
	{
		
		if (amount != 0) // If the amount entered does not equal zero
		{
			
			balance = balance + amount; // Add the amount entered to the balance
			previousTransaction = amount; // Displays the previous transaction amount
		}
	}
	
	
	void withdraw(int amount) // Creates the withdraw method
	{
		
		if (amount != 0) // If the amount entered does not equal zero
		{
			
			balance = balance - amount; // Subtracts the amount entered to the balance
			previousTransaction = -amount; // Displays the previous transaction as the current amount
		}
	}
	
	
	void getPreviousTransaction() // Creates the getPreviousTransaction method
	{
		
		if (previousTransaction > 0) // If the previous transaction amount is more than zero
		{
			
			System.out.println("Deposited: " + previousTransaction); // Displays message stating how much was previously deposited
		}		
		else if (previousTransaction < 0) // else if the previous transaction amount is less than zero
		{
			
			System.out.println("Withdrawn: " + Math.abs(previousTransaction)); // Displays message stating how much was last withdrawn
		}
		else // else if none of these have occured
		{
			
			System.out.println("No transactions have occured"); // Displays message stating no transactions have taken place
		}
	}
	
	
	void ShowMenu() // Creates the ShowMenu function
	{
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in); // Takes input from user
		
		System.out.println("Welcome " + customerName); // Displays message welcoming the user by name
		System.out.println("Your ID is " + customerID); // Displays the customer ID
		System.out.println("\n"); // New line
		
		//System.out.println("Enter an option"); // Displays message asking user to select an option
		//System.out.println("==================================");
		//option = scanner.next().charAt(0); // Gets the first character from user input		
		//System.out.println("\n"); // New line
		
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do // do while loop
		{
			
			System.out.println("==================================");
			System.out.println("Enter an option"); // Displays message asking user to select an option
			System.out.println("==================================");
			option = scanner.next().charAt(0); // Gets the first character from user input
			System.out.println("\n"); // New line
			
			switch(option) // Selects the selected case the user chooses
			{
				
			case 'A':
				System.out.println("==================================");
				System.out.println("Your Balance is = " + balance); // Displays the user's balance
				System.out.println("==================================");
				System.out.println("\n"); // New line
				break;
				
			case 'B':
				System.out.println("==================================");
				System.out.println("Enter an amount to deposit: "); // Displays message asking user to deposit an amount
				System.out.println("==================================");
				int amount = scanner.nextInt(); // Gets user input and stores it in amount variable
				deposit(amount); // Runs deposit method and uses amount variable
				System.out.println("\n"); // New line
				break;
				
			case 'C':
				System.out.println("==================================");
				System.out.println("Enter an amount to withdraw: "); // Displays message asking user to withdraw an amount
				System.out.println("==================================");
				int amount2 = scanner.nextInt(); // Gets user input and stores it in amount2 variable
				withdraw(amount2); // // Runs withdraw method and uses amount2 variable
				System.out.println("\n"); // New line
				break;
				
			case 'D':
				System.out.println("==================================");
				getPreviousTransaction(); // Runs getPreviousTransaction method
				System.out.println("==================================");
				System.out.println("\n"); // New line
				break;
				
			case 'E':
				System.out.println("==================================");
				break;
				
			default: // If user enters value not listed
				System.out.println("Invalid Option. Please enter again."); // Displays error message
				break;
			}
		}
		while (option != 'E'); // After user has exited the system
		System.out.println("Thank you for using our service"); // Displays thank you message
	}
}
