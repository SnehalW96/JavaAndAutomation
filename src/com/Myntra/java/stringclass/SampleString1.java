package com.Myntra.java.stringclass;

public class SampleString1 
{	
	public static void main(String[] args) 
	{
		String a="Hello Java World";
		String b="Wel";
		String c="Come";
		System.out.println("Using method charAt()");
		System.out.println(a.charAt(6));
		System.out.println("Using method endsWith()");
		System.out.println(a.endsWith("World"));
		System.out.println("Using method startsWith()");
		System.out.println(a.startsWith("Hello"));
		System.out.println("Using method concat()");
		System.out.println(b.concat(c));
		System.out.println("Using method indexOf()");
		System.out.println(a.indexOf("W"));
		System.out.println("Using methid lastIndexOf()");
		System.out.println(a.lastIndexOf("a"));
		System.out.println("Using methid subString()");
		System.out.println(a.substring(6));
		System.out.println("Using methid subString()");
		System.out.println(a.substring(6,10));
		System.out.println("Using methid replace()");
		System.out.println(a.replace("e","a"));
		
		



		


	}

}
