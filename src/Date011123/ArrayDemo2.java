package Date011123;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		float[] average=new float[3];
		String[] student_name=new String[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<average.length; i++)
		{
			System.out.println("enyer "+ i + " student name ");
			student_name[i]=sc.next();
			System.out.println("enyer "+ i + " student average marks ");
			average[i]=sc.nextFloat();
		}
		
		for(int i=0; i<average.length; i++)
		{
			System.out.println(average[i]+" "+student_name[i]);
		}

	}

}
