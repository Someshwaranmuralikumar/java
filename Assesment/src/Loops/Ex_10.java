package Loops;
import java.util.*;
public class Ex_10 
{
	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 10");
		System.out.println("Count the number of digit.");
		long num;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = input.nextLong();
		do
		{
			count++;
			num/=10;
		}while(num!=0);
			System.out.print("The total number of digits are : "+count);
	}

}
