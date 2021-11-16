package StarPattern;
import java.util.*;
public class InverRight 
{

	public static void main(String[] args) 
	{
		int i,j,row;
		System.out.println("INVERT RIGHT TRIANGLE");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		row = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=i;j<=row;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
