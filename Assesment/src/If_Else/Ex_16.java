package If_Else;
import java.util.*;
public class Ex_16
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 16");
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first side : ");
		a = input.nextInt();
		System.out.print("Enter the Second side : ");
		b = input.nextInt();
		System.out.print("Enter the Third side : ");
		c = input.nextInt();
		
		if(a==b&&b==c)
		{
			System.out.println("It is an Equatorial Triangle.");
		}
		else if(a==b||b==c||c==a)
		{
			System.out.println("It is an Isosceles Triangle.");
		}
		else
		{
			System.out.println("It is an Scalene Triangle.");
		}
	}

}
