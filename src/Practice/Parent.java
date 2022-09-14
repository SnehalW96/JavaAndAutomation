package Practice;

public class Parent //Parent class
{	
	Parent()//Constructor of parent class
	{
		System.out.println("Parent Class Constructor");
	}
	public void method1()//Method of parent class
	{
		float pi=3.14f,area,perimeter;//Local Variable
		int r=5;
		area=pi*r*r;
		perimeter=2*pi*r;
		System.out.println("Area of Circle is:"+area);
		System.out.println("Perimeter of Circle is:"+perimeter);
		
	}
	
}
