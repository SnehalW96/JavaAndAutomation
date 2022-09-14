package com.Myntra.java.stringclass;

public class SampleString 
{
	public static void main(String[] args) 
	{
		String a="Snehal";
		String b="Snehal";
		String c=new String("Snehal");
		String d=new String("Snehal");
		String e=new String("snehal");
		String f=new String("SNEHAL");
		String g="";
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==c);
		System.out.println("Using method equals()");
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
		System.out.println("Using method equalsIgnoreCase()");
		System.out.println(a.equalsIgnoreCase(e));
		System.out.println("Using method toUpperCase()");
		System.out.println(e.toUpperCase());
		System.out.println("Using method toLowerCase()");
		System.out.println(f.toLowerCase());
		System.out.println("Using methid isEmpty()");
		System.out.println(g.isEmpty());
		System.out.println("Using methid lenth()");
		System.out.println(a.length());	
	}
}
