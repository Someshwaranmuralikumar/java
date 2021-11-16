package OOPS;

public class StackDemo 
{
	int s[] = new int[10];
	int tos;
	StackDemo()
	{
		tos = -1;
	}
	public void push(int item)
	{
		if(tos == 9)
			System.out.println("Stack is full.");
		else
			s[++tos] = item;
	}
	int pop() 
	{
		if(tos>=0)
			return s[tos--];
		else
			System.out.println("Stack is Empty!!");
		  	return -1;
		
	}
}
