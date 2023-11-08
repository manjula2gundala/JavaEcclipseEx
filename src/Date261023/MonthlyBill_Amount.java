//package declaration
package Date261023;

// importing Scanner class
import java.util.Scanner;

// Creating class
public class MonthlyBill_Amount 
{
	// The program Execution starts from here
	public static void main(String[] args)
	{
		// Creating an object for Scanner class
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter total gb of data consumed ");
	  int dataConsumed=sc.nextInt();
	  // closing scanner object
	  sc.close();
	  
	  // checking the conditions
	  if(dataConsumed<10)
		  System.out.println("bill Amount is Rs.300");
	  
	  else if(dataConsumed>10 & dataConsumed <30)
	  {
		  int amount=300+5*(dataConsumed-10);
		  System.out.println("bill Amount is Rs."+amount);
	  }
	  
	  else if(dataConsumed>30)
	  {
		  int amount=400+3*(dataConsumed-30);
		  System.out.println("bill Amount is Rs."+amount);
	  }
	  
	}

}
