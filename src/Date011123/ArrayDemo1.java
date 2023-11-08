package Date011123;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int [] array1;  // 1-Dimensional array declaration
		int i, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		n=sc.nextInt();
		
		array1=new int[n]; // dynamic memory allocation
		
		System.out.println("enter "+ n+" elements to the array");
		
		for(i=0; i<n; i++)
		{
			// read and store to the element of array
			array1[i]=sc.nextInt();
		}
		
		System.out.println("odd numbers ");
		
		for(int j=0; j<n; j++)
		{
			if(array1[j]%2!=0)
			{
				System.out.println(array1[j]);
			}
		}

	}

}
