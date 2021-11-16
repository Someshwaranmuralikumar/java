package StarPattern;
import java.util.*;
public class RightTriangle 
{

	public static void main(String[] args) 
	{
		System.out.println("RIGHT TRIANGLE STAR PATTERN");
		int i ,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
