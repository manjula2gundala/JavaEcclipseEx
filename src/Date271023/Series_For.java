package Date271023;
import java.util.*;
public class Series_For {

	public static void main(String[] args) {
		int i;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		int limit=sc.nextInt();
		
		System.out.println("enter x value");
		int x=sc.nextInt();
		sc.close();
		
		for(i=1; i<=limit; i++)
		{
			sum+=(float)i/x;
			
			System.out.println("Sum of the series 1/x+2/x+...n/x is "+sum);
		}

	}

}
