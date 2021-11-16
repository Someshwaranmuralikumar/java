package StarPattern;
import java.util.*;
public class InvertMirroredRightTriangleHollow 
{

	public static void main(String[] args) 
	{
		System.out.println("INVERT MIRRORED RIGHT TRIANGLE");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=row;j++)
			{
				if(i==1||j==row||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}

