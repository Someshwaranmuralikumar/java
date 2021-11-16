package If_Else;
import java.util.*;
public class Ex_5 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE-5");
		int  num1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num1 = input.nextInt();
		if(num1%2==0)
		{
			System.out.println(num1+"  is an even number.");
		}
		else
		{
			System.out.println(num1+"  is an odd number.");
		}
	}

}
