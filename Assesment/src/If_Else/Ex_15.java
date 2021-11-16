package If_Else;
import java.util.*;
public class Ex_15 
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 15");
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sides = ");
		a = input.nextInt();
		System.out.print("Enter the sides = ");
		b = input.nextInt();
		System.out.print("Enter the sides = ");
		c = input.nextInt();
		if((a+b > c)&&(a+c > b)&&(b+c>a))
		{
			System.out.println("This triangle is valid.");
		}
		else
		{
			System.out.println("This triangle is invalid.");
		}
		
	}

}
