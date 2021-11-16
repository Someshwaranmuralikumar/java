package If_Else;
import java.util.*;
public class Ex_9
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 9");
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		ch = input.next().charAt(0);
		if((ch >='a')&&(ch<='z')||(ch>='A')&&(ch<='Z'))
		{
			System.out.println(ch + " is an alphabet.");
		}
		else if(ch >='0'&& ch<='9')
		{
			System.out.println(ch + " is an digit.");
		}
		else
		{
			System.out.println(ch + " is a specific Character.");
		}
	}

}
