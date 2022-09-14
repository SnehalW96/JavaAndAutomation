package com.Myntra.javaproject.abstractclass;

public class GrandChild extends Child
{
	public void PentHouse() 
	{
		System.out.println("Total no of Pent House=2");
	}
	public static void main(String[] args) 
	{
		GrandChild object=new GrandChild();
		object.Palace();
		object.Car();
		object.Bike();
		object.PentHouse();
	}

}
