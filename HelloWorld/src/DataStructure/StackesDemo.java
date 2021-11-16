package DataStructure;
import java.util.*;
public class StackesDemo 
{
	public static void main(String[] args) 
	{
//		Stacks are FILO -> First IN Last Out
		Stack<String> stack = new Stack<String>();
//		System.out.println(stack.empty());
		
		stack.push("Mine Craft");//0
		stack.push("sky rim");//1
		stack.push("PUBG");//2
		stack.push("Free Fire");//3
		stack.push("Pubg New Slate");
		stack.push("Hitman");
		
		String mfavgame = stack.pop();
		stack.pop();
		System.out.println(stack.peek());//peek means to final value in the stack
		System.out.println(stack.search("Free Fire"));
		System.out.println(stack);
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			
			System.out.print("Enter the string in the stack : ");
			String s1= input.nextLine();
			stack.push(s1);
		}
		System.out.println(stack);
		System.out.println(stack.size());
		stack.add("aventure");
		stack.add("avadi");
		System.out.println("The get from stack "+stack.get(5));
		
		
	}

}
