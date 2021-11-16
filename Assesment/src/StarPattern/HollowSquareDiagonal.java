package StarPattern;

import java.util.Scanner;

public class HollowSquareDiagonal 
{

	public static void main(String[] args) 
	{
		System.out.println("Hollow Square Diagonal");
		int i,j,row,col;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row : ");
		row = input.nextInt();
		System.out.print("Enter the column : ");
		col = input.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{
				if(i==1||i==row||j==1||j==col||i==j||j==(col-i+1))
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
