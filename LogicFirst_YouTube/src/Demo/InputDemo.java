package Demo;
import java.util.*;
public class InputDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Getting INPUT from USER");
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name : ");
		String name = input.nextLine();
		System.out.print("What is your rating : ");
		short rating = input.nextShort();
		input.nextLine();
		System.out.print("Enter your Email : ");
		String email = input.nextLine();
		System.out.println("Hello "+name+" and your rating is "+ rating);	
		System.out.println("Your email id is "+email);
	}
}
