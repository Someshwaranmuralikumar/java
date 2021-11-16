package Loops;
import java.util.*;
public class Ex_6 
{
	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 6");
		System.out.println("Sum of the natural numbers");
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the final natural number to be summed : ");
		int n = input.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum += i;
		}
		System.out.println("The sum of the natural numbers are : "+sum);
	}

}
