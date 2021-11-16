package If_Else;
import java.util.*;
public class Ex_8 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 8");
		char num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the vowels : ");
		num = input.next().charAt(0);
		if((num=='a')||(num=='A')||(num=='e')||(num=='E')||(num=='i')||(num=='I')||(num=='o')||(num=='O')||(num=='u')||(num=='U'))
		{
			System.out.println("Your character is an vowel.");
		}
		else
		{
			System.out.println("Your character is not an vowel.");
		}
	}

}
