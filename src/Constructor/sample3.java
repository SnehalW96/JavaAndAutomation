package Constructor;

public class sample3 
{
	String FirstName;
	String LastName;
	public sample3(String fname,String lname)
	{
		FirstName=fname;
		LastName=lname;
	}
	public static void main(String[] args) 
	{
		sample3 object=new sample3("Snehal","Wani");//Constructor object creation with 2 arguments
		System.out.println("Name :"+object.FirstName+" "+object.LastName);
	}

}
