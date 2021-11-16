package If_Else;
import java.util.*;
public class Ex_1 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 1");
		int num1,num2;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the num1 & num2: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
//		if(num1>num2)
//			System.out.println("num1 is maximum = "+num1);
//		else
//			System.out.println("num2 is maximum = "+num2);
		int maximum = (num1>num2)?num1:num2;
		System.out.println("Maximumm number is "+maximum);
	}

}
