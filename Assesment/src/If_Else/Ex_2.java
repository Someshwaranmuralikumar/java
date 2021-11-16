package If_Else;
import java.util.*;
public class Ex_2
{

	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 2");
		int num1,num2,num3,maximum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the num1  : ");
		num1 = input.nextInt();
		System.out.print("Enter the num2  : ");
		num2 = input.nextInt();
		System.out.print("Enter the num3  : ");
		num3 = input.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				maximum = num1;
				
			}
			else
			{
				maximum = num3;
			}
		}
		else
		{
			if(num2>num3)
			{
				maximum = num2;
			}
			else
			{
				maximum = num3;
			}
		}
		System.out.println("Maximum is "+maximum);
	}

}
