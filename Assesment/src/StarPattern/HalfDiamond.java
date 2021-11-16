package StarPattern;

public class HalfDiamond
{

	public static void main(String[] args)
	{
		int i,j,row,col;
		col=1;
		row = 5;
		for(i=1;i<row*2;i++)
		{
			for(j=1;j<=col;j++)
			{
				System.out.print("*");
			}
			if(i<row)
				col++;
			else
				col--;
			System.out.println(" ");
		}
	}

}
