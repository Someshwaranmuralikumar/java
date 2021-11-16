package If_Else;
import java.util.*;
public class Ex_12 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 12");
		int month;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the respective month : ");
		month = input.nextInt();
		if(month>0 && month<13)
		{
			if(month==1)
				System.out.println("This is a January month and it contains 31 days");
			else if(month==2)
				System.out.println("This is a February month and it contains 28 or 29 days");
			else if(month==3)
				System.out.println("This is a March month and it contains 31 days");
			else if(month==4)
				System.out.println("This is a April month and it contains 30 days");
			else if(month==5)
				System.out.println("This is a May month and it contains 31 days");
			else if(month==6)
				System.out.println("This is a June month and it contains 30 days");
			else if(month==7)
				System.out.println("This is a July month and it contains 31 days");
			else if(month==8)
				System.out.println("This is a Agust month and it contains 30 days");
			else if(month==9)
				System.out.println("This is a September month and it contains 31 days");
			else if(month==10)
				System.out.println("This is a October month and it contains 30 days");
			else if(month==11)
				System.out.println("This is a November month and it contains 31 days");
			else if(month==12)
				System.out.println("This is a December month and it contains 30 days");
		}
		else
		{
			System.out.println("Please enter the correct month number!!!!");
		}
	}

}
