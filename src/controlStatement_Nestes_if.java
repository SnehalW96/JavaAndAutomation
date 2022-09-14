
public class controlStatement_Nestes_if 
{
	public static void main(String[] args) 
	{
		int n=71;
		if(n>=90)
		{	
			System.out.println("A Grade");
		}
		if(n<90&&n>=80)
		{
				System.out.println("B Grade");
				
		}
		if(n<80&&n>=70)
		{
				System.out.println("C Grade");
		}
		if(n<70&&n>=0)
		{
			System.out.println("Pass Class");
		}
		if(n<60)
		{
			System.out.println("Fail");
		}
	}
}
