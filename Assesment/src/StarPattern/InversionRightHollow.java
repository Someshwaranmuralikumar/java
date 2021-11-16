package StarPattern;
import java.util.*;
public class InversionRightHollow
{

	public static void main(String[] args) 
	{
		System.out.println("INVERT RIGHT HOLLOW TRIANGLE STAR PATTERN");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=i;j<=row;j++)
			{
				if(j==row||i==1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
