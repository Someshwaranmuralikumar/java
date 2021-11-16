package If_Else;
import java.util.*;
public class Ex_14 
{

	public static void main(String[] args)
	{
		int angle1 , angle2 , angle3 , sum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the angle1 : ");
		angle1 = input.nextInt();
		System.out.print("Enter the angle2 : ");
		angle2 = input.nextInt();
		System.out.print("Enter the angle3 : ");
		angle3 = input.nextInt();
		
		sum = angle1+angle2+angle3;
		if(sum == 180 && angle1 >0 && angle2>0 && angle3>0)
		{
			System.out.println("It is valid.");
		}
		else
		{
			System.out.println("It is invalid.");
		}
	}

}
