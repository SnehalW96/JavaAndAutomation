/* if-else loop syntax
   if(Condition)
   {
  		block of code to be executed if the condition is true
   }
    else 
    {
  		block of code to be executed if the condition is false
	}
 */
package com.Myntra.javaproject.dailyMock;
import java.util.Scanner;

public class controlStatement_if_Else 
{
	
	public static void main(String[] args) 
	{
		Scanner n1 = new Scanner(System.in);
		//try 
		//{
			System.out.println("Enter number");
			int num = n1.nextInt();
			//System.out.println("Number is :"+num);
			if(num>0)
			{
				System.out.println("Given Number is Positive");
			}
			else
			{
				System.out.println("Given number is Negative");
			}
		//}
		//finally
		//{
			//n1.close();
		//}
	}
		
}


