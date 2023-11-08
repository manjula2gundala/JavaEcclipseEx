package Date061123;

// main class
public class Vehicle_Implement 
{
	// main method
	public static void main(String[] args) 
	{
		// creating instance of Car class
		Car c1=new Car("Toyato", "BMW", 2020, 250);
		c1.drive();
		
		// creating instance of bike class
		Bike b1=new Bike("Yamaha", "Royal Enfield", 2019, 120);
		b1.drive();
	}
}
