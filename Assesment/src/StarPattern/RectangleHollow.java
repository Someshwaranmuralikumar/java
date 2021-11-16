package StarPattern;
import java.util.*;
public class RectangleHollow 
{

	public static void main(String[] args)
	{
		System.out.println("Rectangle Star Hollow Pattern");
		int i,j,row,col;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		System.out.print("Enter the column : ");
		col = input.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(i==0||i==row-1||j==0||j==col-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
