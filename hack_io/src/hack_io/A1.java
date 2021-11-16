package hack_io;

public class A1
{

	public static void main(String[] args) 
	{
		A2 first = new A2();
		A2 second = new A2();
		int countroll = 0;
		int total1;
		int total2;
		do
		{
			first.roll();
			total1 = first.die1+second.die2;
			System.out.println("First Pair comes up : "+total1);
			
			second.roll();
			total2 = first.die1+second.die2;
			System.out.println("Second pair comes up : "+total2);
			
			System.out.println();
			countroll++;
		}while(total1 != total2);
		
		System.out.println("It tooks "+countroll+" untill the total are same  in the class of the program.");
	}

}
