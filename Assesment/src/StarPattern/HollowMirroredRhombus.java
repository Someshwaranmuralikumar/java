package StarPattern;
import java.util.*;
public class HollowMirroredRhombus {

	public static void main(String[] args)
	{
		System.out.println("HOLLOW MIRRORED RHOMBUS STAR PATTERN");
		int i,j,row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<row;j++)
			{
				if(i==1||i==row||j==row-1||j==1)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println(" ");
		}
	}

}
