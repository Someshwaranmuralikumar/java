package hack_io;

public class A2 {
	int die1;
	int die2;
	public A2()
	{
		roll();
	}
	public void roll()
	{
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
	}

}
