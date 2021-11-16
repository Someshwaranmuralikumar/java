package StarPattern;
import java.util.*;
public class LeftTriangleHollow 
{

	public static void main(String[] args)
	{
		System.out.println("LEFT HOLLOW TRIANGLE STAR PATTERN");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=i;j<row;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i==row||i==j||j==1)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
