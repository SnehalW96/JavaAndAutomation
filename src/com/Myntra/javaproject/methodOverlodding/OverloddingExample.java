package com.Myntra.javaproject.methodOverlodding;

public class OverloddingExample 
{
	int i=10;
	int j=20;
	int sum;
	static int mul,k=5,l=10;
	public void Addition()
	{
		sum=i+j;
		System.out.println(sum);
	}
	public void Addition(int a) 
	{
		sum=i+j+a;
		System.out.println(sum);
	}
	public void Addition(int a,int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	public static void Multiplication()
	{
		mul=k*l;
		System.out.println(mul);
	}
	public static void Multiplication(int a)
	{
		mul=k*l+a;
		System.out.println(mul);
	}
	public static void main(String[] args) 
	{
		OverloddingExample object=new OverloddingExample();
		object.Addition();
		object.Addition(30);
		object.Addition(40, 50);
		OverloddingExample.Multiplication();
		OverloddingExample.Multiplication(25);
		
	}

}
