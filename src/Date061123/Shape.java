// package declaration
package Date061123;
 // class called Shape
public class Shape
{
	// method called getArea()
	public void getArea()
	{
		System.out.println("Shape method");
	}
}
// subclass called Circle
class Circle extends Shape
{
	int radius;
	//  constructor that takes the value of radius(int) as input parameter
	public Circle(int radius)
	{
		this.radius=radius;
	}
	// Override the getArea() method to calculate the area of a Circle.
	public void getArea()
	{
		double Circle_area=3.14*radius*radius;
		System.out.println("Area of the Circle: "+Circle_area);
	}
}
// sub-class called square
class Square extends Shape
{
	int length;
	// constructor that takes length as input. 
	public Square(int length)
	{
		this.length=length;
	}
	// Override the getArea() method to calculate the area of a square.
	public void getArea()
	{
		float square_area=length*length;
		System.out.println("Area of the Square: "+square_area);
	}
}
// subclass of Shape called Rectangle 
class Rectangle extends Shape
{
	int height, width;
	// constructor that takes height and width as inputs.
	public Rectangle(int height, int width)
	{
		this.height=height;
		this.width=width;
	}
	// Override the getArea() method to calculate the area of a rectangle.
	public void getArea()
	{
		float Rectangle_area=height*width;
		System.out.println("Area of the Rectangle: "+Rectangle_area);
	}
}
