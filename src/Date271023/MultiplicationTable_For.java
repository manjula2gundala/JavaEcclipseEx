package Date271023;

import java.util.Scanner;

public class MultiplicationTable_For {

	public static void main(String[] args) {
		// read table number and range, display multiplication table
		
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter table number");
		int num=sc.nextInt();
		System.out.println("enter range");
		int range=sc.nextInt();
		sc.close();
				
		for(int i=1; i<=range; i++)
		{
			System.out.println(num+"*"+i+ "="+(i*num));
		}
				

	}

}
