package Date25;

 //class called
public class Rectangle1
{
//     private static final String Sytsem = null;
	int length, width, area;
     
     Rectangle1(int l, int w)
     {
    	 length=l;
    	 width=w;
     }
     void findArea()
     {
    	 area=length*width;
     }
     
	public static void main(String[] args)
	{
		Rectangle1 r1, r2;
		r1=new Rectangle1(3, 4);
		r2=new Rectangle1(4, 3);
		r1.findArea();
		r2.findArea();
		
		/*if(r1.area>r2.area)
		{
			System.out.println("Rectangle 1 > Rectangle2");
		}
		else if(r1.area<r2.area)
		{
			System.out.println("Rectangle 1 < Rectangle2");
		}
		else
		{
			System.out.println("Rectangle 1 = Rectangle2");
		} */
		
		//Nested conditional operator
		String message;
		message=(r1.area>r2.area)? "Rectangle1 >Rectangle2":(r1.area<r2.area)? "Rectangle1<Rectabgle2":"They are equal";
		System.out.println(message);
	}
}
