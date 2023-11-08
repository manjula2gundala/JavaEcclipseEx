
package Date031123;

import java.util.Scanner;

// main class 
public class Invoice_main 
{
	// main method
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// storing n number of invoices
		System.out.println("enter number of objects");
		int n=sc.nextInt();
		
		// array of objects
		Invoice[] invoice=new Invoice[n];
		
		// allocating memory of each object
		for(int i=0; i<n; i++)
		{
			invoice[i]=new Invoice();  
			invoice[i].add_invoice();	
		}
		// displaying all the data
		for(int i=0; i<n; i++)
		{
			invoice[i].display_invoice();
		}
	}
}
