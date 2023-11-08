package Date261023;

import java.util.Scanner;

public class Student_Marks_Grade {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Roll number ");
		int rollno=sc.nextInt();
		
		System.out.println("enter Student name");
		String name=sc.next();
		
		System.out.println("enter 4 subjects marks ");
		int subject1=sc.nextInt();
		int subject2=sc.nextInt();
		int subject3=sc.nextInt();
		int subject4=sc.nextInt();
		sc.close();
		
		int total=subject1+subject2+subject3+subject4;
		
		float average=(float)total/4;
		
		String result, grade = null;
		if(subject1>=40 & subject2>=40 & subject3>=40 & subject4>=40)
		{
			result="pass";
			if(average>=80)
				grade="A+";
			else if(average>=60 & average<80)
				grade="A";
			else if(average>=50 & average<60)
				grade="B";
			else if(average>=40 & average<50)
				grade="C";
		}
		else
		{
			result="Fail";
			grade="F";
		}
		System.out.println("Roll Number: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("Subject1 marks: "+subject1);
		System.out.println("Subject2 marks: "+subject2);
		System.out.println("Subject3 marks: "+subject3);
		System.out.println("Subject4 marks: "+subject4);
		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+average);
		System.out.println("Result: "+result);
		System.out.println("Grade: "+grade);

	}

}
