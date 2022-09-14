package Practice;

public class Child extends Parent
{
	int x=7;
	public static void main(String[] args) 
	{
		Child object=new Child();//Creating object of child class
	    System.out.println(object.x);
		object.method1();//Calling parent class method using child class object
	}
}
