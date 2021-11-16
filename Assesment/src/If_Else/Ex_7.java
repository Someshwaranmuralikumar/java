package If_Else;
import java.util.*;
public class Ex_7 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE-7");
		char num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the character in the alphabets : ");
		num = input.next().charAt(0);
		if((num>='a')&&(num<='z')||(num>='A')&&(num<='Z'))
		{
			System.out.println("Character is an Alphabet. ");
		}
		else
		{
			System.out.println("Character is not an alphabet.");
		}
		
		
	}

}
