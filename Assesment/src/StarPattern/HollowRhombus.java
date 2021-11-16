package StarPattern;
import java.util.*;
public class HollowRhombus 
{

	public static void main(String[] args) 
	{
		System.out.println("RHOMBUS HOLLOW STAR PATTERN");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = input.nextInt();
		for(int i =1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==row||j==1||j==row)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
