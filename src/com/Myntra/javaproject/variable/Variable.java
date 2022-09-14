package com.Myntra.javaproject.variable;

public class Variable 
{
	
	public void Method1()
	{
		int a=10; //local variable
		System.out.println(a);
	}
	public void Method2() 
	{
		int b=20; //local variable
		System.out.println(b);
	}
	public static void Method3()
	{
		int a=50,b=20;
		System.out.println(a+b);
		
	}
	public static void main(String[] args) 
	{
		Variable object1=new Variable();
		object1.Method1();
		object1.Method2();
		Method3();
		
	}

}
