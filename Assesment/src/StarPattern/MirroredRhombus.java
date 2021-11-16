package StarPattern;
import java.util.*;
public class MirroredRhombus
{

	public static void main(String[] args)
	{
		System.out.println("MIRRORED RHOMBUS STAR PATTERN");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<row;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
