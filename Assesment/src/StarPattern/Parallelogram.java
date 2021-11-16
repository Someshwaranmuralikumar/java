package StarPattern;
import java.util.*;
public class Parallelogram 
{

	public static void main(String[] args) 
	{
		System.out.println("PARALLELOGRAM");
		int i,j,row,col;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		System.out.print("Enter the column : ");
		col = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=col;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
