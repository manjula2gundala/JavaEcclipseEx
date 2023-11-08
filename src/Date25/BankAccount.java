// package declaration
package Date25;

// creating a class called BankAccount
public class BankAccount 
{
	// Adding data members
	String accountHolderName;
	int accountNumber, balance;
	
	// Constructor using all data members
	public BankAccount(String name, int number, int bal)
	{
		accountHolderName=name;
		accountNumber=number;
		balance=bal;
	}
	
	// Adding getters and setters
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public int getBalance() 
	{
		return balance;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	
	// Method to deposit  
	public String deposit(int deposit)
	{
		balance=balance+deposit;
		// Condition to check if minimum balance is maintaining or not
		return (balance>=5000 ? "minimum balance is maintained":"Minimum balance is not maintained");
	}
	
	// Method to Withdraw
	public String withdraw(int withdraw)
	{
		if(withdraw<=balance)
		{
			balance=balance-withdraw;
		}
		else
		{
			System.out.println("low balance");
		}
		return (balance>=5000 ? "minimum balance is maintained":"Minimum balance is not maintained");
	}
	
	// Main method
	public static void main(String[] args)
	{
		BankAccount bank=new BankAccount("Manjula", 4626565, 10000);
		System.out.println("Accout number: "+bank.getAccountNumber());
		System.out.println("account holder name: "+bank.getAccountHolderName());
		System.out.println("current balance: "+bank.getBalance());
		
		System.out.println(bank.deposit(10000));
		System.out.println("balance after deposit: "+bank.getBalance());
		System.out.println(bank.withdraw(5000));
		System.out.println("balance after withdraw: "+bank.getBalance());
		
//		String msg= bank.deposit(1000);
//		System.out.println(msg);
//		System.out.println("Balance after deposit " + bank.getBalance());
//		msg=bank.withdraw(7000);
//		System.out.println(msg);
//		System.out.println("Balance after withdraw " + bank.getBalance());
		
	}
}
