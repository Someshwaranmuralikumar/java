package If_Else;
import java.util.*;
public class Ex_20 
{

	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 20");
		int salary;
		double total,hra,da;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the basic amount of salary is ");
		salary = input.nextInt();
		if(salary<=10000)
		{
			hra = salary*0.8;
			da = salary*0.2;
		}
		else if(salary<=20000)
		{
			hra = salary*0.9;
			da = salary*0.25;
		}
		else
		{
			hra = salary*0.95;
			da = salary*0.3;
		}
		total = salary+hra+da;
		System.out.println("GROSS SALARY OF THE EMPLOYEE IS "+total);
		
	}

}
