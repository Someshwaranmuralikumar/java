package Demo;

public class Loops
{

	public static void main(String[] args) 
	{
		for(int i =1;i<=1;i++)
		{
			System.out.println("*");
		}
	System.out.println("Nested Loop");
	for(int i =0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for(int i =0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==1||i==5||j==1||j==5)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(i);
		}
		System.out.println(" ");
	}
	}

}
