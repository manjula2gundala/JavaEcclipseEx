package Date031123;

import java.util.Scanner;

public class ArrayofObjects {

	public static void main(String[] args)
	{
		Books[] b=new Books[3];   // array of objects
		
		// allocating memory of each object and read data 
		for(int i=0; i<3; i++)
		{
			b[i]=new Books();  
			b[i].add_books();
		}
		
		// display data 
		for(int i=0; i<3; i++)
		{
			b[i].display_books();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter book title to search");
			String title=sc.next();
			
			// linear search
			int flag=0;
			for(int j=0; j<3; j++)
			{
				if(title.compareTo(b[i].book_title)==0)
				{
					b[j].display_books();
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.println("book not found");
			}
		}

	}

}
