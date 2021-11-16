package StarPattern;
import java.util.*;
public class Square 
{

	public static void main(String[] args)
	{
		int i,j;
		System.out.println("SQUARE STAR PATTERN");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = input.nextInt();
		for(i =0;i<row;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
