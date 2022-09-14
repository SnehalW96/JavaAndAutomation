package Constructor;

public class sample2 
{
	int x;
	public sample2(int y)//Constructor with one parameter
	{
		x=y;
	}
	public static void main(String[] args) 
	{
		sample2 object=new sample2(10);//Constructor object creation and passing the value to the constructor
		System.out.println(object.x);//printing the value of x
		
	}

}
