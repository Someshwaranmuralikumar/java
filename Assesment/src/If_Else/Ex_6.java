package If_Else;
import java.util.*;
public class Ex_6 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE-6");
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year : ");
		num1 = input.nextInt();
		if((num1%4==0)&&(num1%100!=0)&&(num1%400!=0))
		{
			System.out.println(num1+"  is an leap year.");
		}
		else
		{
			System.out.println(num1+"  is not an leap year.");
		}
		
	}

}
