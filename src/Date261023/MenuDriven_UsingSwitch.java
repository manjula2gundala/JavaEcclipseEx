package Date261023;
import java.util.Scanner;
public class MenuDriven_UsingSwitch 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Even/Odd ");
			System.out.println("2.Swap variable values");
			System.out.println("3.Number by 5 and 7");
			System.out.println("4.Positive/Negative/zero");
			System.out.println("5.Exit");
			
			System.out.println("enter your choice between 1-5: ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter number to find whether it is even or odd: ");
				int number=sc.nextInt();
				
				if(number%2==0)
				{
					System.out.println("entered number is an even Number");
				}
				else
				{
					System.out.println("entered number is an Odd Number");
					break;
				}
			 }
			case 2:
			{
				System.out.println("enter 1st number need to be swapped ");
				int a=sc.nextInt();
				System.out.println("enter 2nd number need to be swapped ");
				int b=sc.nextInt();
				
				int temp=a;
				a=b;
				b=temp;
				System.out.println("Swapped values: a= "+a +", b= "+b);
				break;
			 }
			case 3:
			{
				int number=sc.nextInt();
				if(number%5==0 && number%7==0)
				{
					System.out.println("enterred number "+number +" is divisible by both");
					break;
				}
			}
			case 4:
			{
				System.out.println("enter number to check positive/ negative or zero ");
				int num=sc.nextInt();
				
				if(num>0)
					System.out.println("Positive number ");
				else if(num<0)
					System.out.println("Negative number");
				else
					System.out.println("number is zero");
				break;
			}
			case 5:
			{
				System.out.println("end of program ");
				System.exit(0);
			}
			default:
			{
				System.out.println("Invalid choice ");
			}
			sc.close();
			}
		}
	}
}
