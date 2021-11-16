package If_Else;
import java.util.*;
public class Ex_4
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 4");
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num1 = input.nextInt();
		if(num1%5==0 && num1%11==0)
			
		{
			System.out.println("Number is divisible by 5 and 11.");
		}
		else
		{
			System.out.println("Number is not divisible by 5 and 11");
		}
	}

}
