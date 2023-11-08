package Date031123;

import java.util.Scanner;

public class Books 
{
	public int book_id;
	public String book_title, author;
	public float price;
	
	
	// default constructor
	public Books()
	{
	
	}

	// constructor with parameters
	public Books(int book_id, String book_title, String author, float price)
	{
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.author = author;
		this.price = price;
	}
	
	public void add_books()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book id and title");
		book_id=sc.nextInt();
		book_title=sc.next();
		System.out.println("enter book author and price");
		author=sc.next();
		price=sc.nextFloat();
		
	}
	
	public void display_books()
	{
		System.out.println("Book id: "+book_id);
		System.out.println("Book title: "+book_title);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
	}
	
}
