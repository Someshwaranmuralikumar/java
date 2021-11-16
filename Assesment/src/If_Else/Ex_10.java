package If_Else;
import java.util.*;
public class Ex_10
{

	public static void main(String[] args)
	{
		System.out.println("EXERCISE - 10");
		char ch;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lowercase or uppercase Character : ");
		ch = input.next().charAt(0);
		if((ch>='a')&&(ch<='z'))
		{
			System.out.println(ch + "  is an LowerCase.");
		}
		else if((ch>='A')&&(ch<='Z'))
		{
			System.out.println(ch + "  is an UpperCase.");
		}
		else
		{
			System.out.println(ch + "  is not an Character.");
		}
		
		
	}

}
