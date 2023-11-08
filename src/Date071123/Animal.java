// package declaration
package Date071123;
// superclass called Animal
public class Animal 
{
	// method called makeSound()
	public void makeSound()
	{
		System.out.println("The animal makes Sound");	
	}
}
// sub class called Animal
class Dog extends Animal
{
	// sub class method which overrides super class method.
	public void makeSound()
	{
		super.makeSound(); // it will print super class method body
		System.out.println("The Dog barks");
	}
}
//sub class called Animal
class Cat extends Animal
{
	// sub class method which overrides super class method.
	public void makeSound()
	{
		System.out.println("The cat meows");
	}
}
