package Loops;
import java.util.*;
public class Ex_7 
{
	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 7");
		System.out.println("Sum of the even numbers");
		int sum , num;
		sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the final number to get even number : ");
		num = input.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum +=i;
			}
			
		}
		System.out.println("The sum of the even number are : "+sum);
	}

}
