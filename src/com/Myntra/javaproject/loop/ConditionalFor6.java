package com.Myntra.javaproject.loop;
// Print half of pyramid of * using for loop
public class ConditionalFor6 
{
	public static void main(String[] args) 
	{
		int i,j,rows=5;
		for(i=1;i<=rows;i++) 
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
