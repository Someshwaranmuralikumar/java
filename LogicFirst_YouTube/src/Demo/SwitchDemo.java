package Demo;
import java.util.*;
public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = input.nextInt();
		System.out.println("Enter the Second number : ");
		b = input.nextInt();
		char Operation;
		System.out.println("Enter the operator +,-,/,* : ");
		Operation = input.next().charAt(0);
		
		switch (Operation)
		{
		case '+':
			System.out.println(a + " "+" + "+ b + " = "+(a+b));
			break;
		case '-':
			System.out.println(a +" - " + b + " = "+(a-b));
			break;
		case '*':
			System.out.println(a +" * "+ b + " = "+(a*b));
			break;
		case '/':
			System.out.println(a + " / "+ b + " = "+(a/b));
			break;
		default:
			System.out.println("You have incorrect Symbol : ");
			break;
		}
	}

}
