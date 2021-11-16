package If_Else;
import java.util.*;
public class Ex_11 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 11");
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number (1-7): ");
		num1 = input.nextInt();
		if(num1>0 && num1<8)
		{
			switch(num1)
			{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thrusday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter the correct number between 1-7!!!!");
				break;
			}
		}
	}

}
