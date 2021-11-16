package Loops;
import java.util.*;
public class Ex_9
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 9");
		System.out.println("Multiplication Tables");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the multiplication Table : ");
		int num = input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println("5  * "+i+" = "+num*i);
		}
	}

}
