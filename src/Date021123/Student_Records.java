 // package declaration
package Date021123;
 // importing scanner class
import java.util.*;
// class to store student details
public class Student_Records
{
	// main method - program execution starts here
	public static void main(String[] args)
	{
		// object of scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students ");
		int number=sc.nextInt();
		
		// Dynamic memory allocation
		int[] rollno=new int[number];
		String[] sname=new String[number];
		float[] average_marks=new float[number];
		
		// taking student details from the user
		for(int i=0; i<rollno.length; i++)
		{
			System.out.println("enter student roll number ");
			rollno[i]=sc.nextInt();
			System.out.println("enter student name ");
			sname[i]=sc.next();
			System.out.println("enter average marks of student ");
			average_marks[i]=sc.nextFloat();
		}
		
		// Printing student details
		System.out.println("List of the students: ");
		for(int i=0; i<rollno.length; i++)
		{
			System.out.println(rollno[i]+" "+sname[i]+" "+average_marks[i]);
		}
		
		// average marks>60
		System.out.println("list of students whose average marks greater than 60: ");
		for(int i=0; i<rollno.length; i++)
		{
			if(average_marks[i]>60)
			{
				System.out.println(sname[i]+" "+average_marks[i]);
			}
		}
		

	}

}
