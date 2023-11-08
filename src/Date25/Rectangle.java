// package declaration
package Date25;

// creating a class called Rectangle
public class Rectangle
{
	//declaring data members
	int length, width, area;
    
	// constructor which accepts parameters length and width
    Rectangle(int l, int w)
    {
   	 length=l;
   	 width=w;
    }
    
    // method to find area of the Rectangle
    void findArea()
    {
   	 area=length*width;
    }
    
    //main method
	public static void main(String[] args)
	{
		Rectangle1 r1, r2;
		// instantiating two rectangle classes with random values
		r1=new Rectangle1(10, 20);
		r2=new Rectangle1(11, 21);
		// calling findArea() method to find area of 2 Rectangles
		r1.findArea();
		r2.findArea();
		
		// Comparing areas of two Rectangles
		if(r1.area>r2.area)
		{
			System.out.println("Rectangle 1 > Rectangle 2");
		}
		else if(r1.area<r2.area)
		{
			System.out.println("Rectangle 1 < Rectangle 2");
		}
		else
		{
			System.out.println("Rectangle 1 = Rectangle 2");
		} 
		
//		//Nested conditional operator
//		String message;
//		message=(r1.area>r2.area)? "Rectangle1 >Rectangle2":(r1.area<r2.area)? "Rectangle1<Rectabgle2":"They are equal";
//		System.out.println(message);
	}
}

