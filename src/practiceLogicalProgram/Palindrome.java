package practiceLogicalProgram;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n=197,temp,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{ 
			System.out.println("Number is not Palindrome");
		}
		
	}
}
