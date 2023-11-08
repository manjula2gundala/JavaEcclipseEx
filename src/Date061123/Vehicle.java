// package declaration
package Date061123;
// parent / super class
public class Vehicle
{
	// data members
	String make, model;
	int year, maximum_speed;
	// parent class method
	public void drive()
	{
		System.out.println(make + " " + model + " vehicle is driving");
	}
	// parameterized constructor
	public Vehicle(String make, String model, int year, int maximum_speed)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.maximum_speed=maximum_speed;
	}
}
// child / sub class 1
class Car extends Vehicle
{
	// sub class parameterized constructor 1
	public Car(String make, String model, int year, int maximum_speed) 
	{
		super(make, model, year, maximum_speed);
	}
	// sub class method 1- overrided from super class 
	public void drive()
	{
		System.out.println(make+" "+model+ " car is driving ");
	}
	
}
//child / sub class 2
class Bike extends Vehicle
{
	// sub class parameterized constructor 2
	public Bike(String make, String model, int year, int maximum_speed) 
	{
		super(make, model, year, maximum_speed);
	}
	// sub class method 1- overrided from super class 
	public void drive()
	{
		System.out.println(make+" "+model+ " Bike is driving ");
	}
	
}
