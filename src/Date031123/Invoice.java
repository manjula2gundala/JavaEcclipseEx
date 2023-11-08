 // package declaration
package Date031123;
// importing scanner class
import java.util.Scanner;
// defining a class called Invoice
public class Invoice 
{
	// data members
	public String invoice_id;
	public float invoice_price;
	public String vendor_name;
	public String invoice_name;
	public String location;
	
	// Scanner object to get input from the user
	Scanner sc=new Scanner(System.in);
	
	// Default constructor
	public Invoice()
	{
		
	}
	
	// method to read data from user
	public void add_invoice()
	{
		System.out.println("enter invoice id");
		invoice_id=sc.next();
		System.out.println("enter invoice price");
		invoice_price=sc.nextFloat();
		System.out.println("enter vendor name");
		vendor_name=sc.next();
		System.out.println("enter invoice name");
		invoice_name=sc.next();
		System.out.println("enter location");
		location=sc.next();		
	}
	
	// method to display all data members
	public void display_invoice()
	{
		System.out.println("invoice id: "+invoice_id);
		System.out.println("invoice price: "+invoice_price);
		System.out.println("vendor name: "+vendor_name);
		System.out.println("invoice name: "+invoice_name);
		System.out.println("location: "+location);
	}
}
