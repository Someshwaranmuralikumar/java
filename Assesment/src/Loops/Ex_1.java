package Loops;
import java.util.*;
public class Ex_1
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 1");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the final natural number do you want : ");
		int num;
		num = input.nextInt();
		System.out.println("Natural Numbers from 1 to "+num);
		for(int i =1;i<=num;i++)
		{
			System.out.println(i);
		}
	}

}
