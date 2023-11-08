package Date011123;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start number ");
		int start=sc.nextInt();
		System.out.println("enter last number ");
		int end=sc.nextInt();
		sc.close();
		for(int i=start; i<=end; i++)
		{
			int num=i;
			int sum=0, factor=1;
			while(factor<num)
			{
				if(num%factor==0)
				{
					sum+=factor;
				}
				factor++;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}

	}

}
