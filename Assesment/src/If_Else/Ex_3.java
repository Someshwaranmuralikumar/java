package If_Else;
import java.util.*;
public class Ex_3 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 3");
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num1 = input.nextInt();
		if(num1>0)
		{
			System.out.println(num1 + "  is a positive number.");
		}
		else if(num1 ==0)
		{
			System.out.println(num1 + "  is a zero.");
		}
		else
		{
			System.out.println(num1 + "  is a negative number.");
		}
	}

}
