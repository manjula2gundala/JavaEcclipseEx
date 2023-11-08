package Date061123;
// main /  implementation class
public class Shape_Implemnt
{
	// main method
	public static void main(String[] args) 
	{
		// creating object for Circle class
		Circle c1=new Circle(2);
		// calling method - getArea() for circle area
		c1.getArea();
		// creating object for Square class
		Square s1=new Square(7);
		// calling method - getArea() for square area
		s1.getArea();
		// creating object for Rectangle  class
		Rectangle r1=new Rectangle(8, 5);
		// calling method - getArea() for rectangle area
		r1.getArea();
	}
}
