package Loops;
import java.util.*;
public class Ex_8 
{
	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 8");
		System.out.println("Sum of the Odd number.");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sum of the odd last number : ");
		int num = input.nextInt();
		int sum =0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==1)
			{
				sum += i;
			}
		}
		System.out.println("The sum of the odd numbers are "+sum);
	}

}
