package com.Myntra.java.stringclass;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s="Snehal Wani";
		String reverseStr="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			reverseStr=reverseStr+s.charAt(i);
		}
		System.out.println("Original string : "+s);
		
		System.out.println("Reverse string : "+reverseStr);
		
	}

}
