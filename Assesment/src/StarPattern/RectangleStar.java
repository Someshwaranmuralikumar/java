package StarPattern;
import java.util.*;
public class RectangleStar
{

	public static void main(String[] args) 
	{
		int i,j,row,col;
		System.out.println("RECTANGLE STAR PATTERN");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		System.out.print("Enter the column : ");
		col = input.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
