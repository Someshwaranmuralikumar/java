package StarPattern;
import java.util.*;
public class RightTriangleHollow 
{

	public static void main(String[] args) 
	{
		System.out.println("RIGHT TRIANGLE HOLLOW");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1||i==j||i==row)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
