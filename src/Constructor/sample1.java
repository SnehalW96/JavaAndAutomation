package Constructor;

public class sample1 
{
	float x;//global variable
	//sample1() 
	//{
		//Set the initial value for the class attribute x
	//}
	public static void main(String[] args) 
	{
		float y;
		sample1 object=new sample1();
		//Create the object of sample1 class(This will call the constructor)
		y=object.x;
		System.out.println(y);//print the value of x
	}
}
