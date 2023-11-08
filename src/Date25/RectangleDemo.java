package Date25;

// class called Rectangle
class RectangleDemoo
{
	int length, width;
	
	
	public RectangleDemoo(int length, int width)
	{
		length=length;
		width=width;
	}
	
	public double Area()
	{
		double Area=length*width;
		return Area;
	}
}

public class RectangleDemo
{
	public static void main(String[] args)
	{
		RectangleDemoo r1=new RectangleDemoo(2,3);
		RectangleDemoo r2=new RectangleDemoo(10, 20);
		double area1=r1.Area();
		double area2=r2.Area();
		
		if(area1>area2)
		{
			System.out.println("Rectangle 1 > Reactangle 2");
		}
		else
		{
			System.out.println("Rectangle 1 < Reactangle 2");
		}
	}
	
}

