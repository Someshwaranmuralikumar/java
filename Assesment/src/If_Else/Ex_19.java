package If_Else;
import java.util.*;
public class Ex_19 
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE-19");
		int phy,che,bio,math,comp;
		double average,percentage;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total mark of 5 subjects");
		System.out.print("Enter the Physics mark : ");
		phy = input.nextInt();
		System.out.print("Enter the Chemistry mark : ");
		che = input.nextInt();
		System.out.print("Enter the Biology mark : ");
		bio = input.nextInt();
		System.out.print("Enter the Mathematics mark : ");
		math = input.nextInt();
		System.out.print("Enter the Computer mark : ");
		comp = input.nextInt();
		
		average = (phy+che+bio+math+comp)/5;
		percentage = average;
		char Grade;
		
		if(percentage>=90)
			Grade = 'A';
		else if(percentage>=80)
			Grade = 'B';
		else if(percentage>=70)
			Grade = 'C';
		else if(percentage>=60)
			Grade = 'D';
		else if(percentage>=40)
			Grade = 'E';
		else
			Grade = 'F';
		
		System.out.println("The average is "+average);
		System.out.println("The percentage is "+percentage+"  % and the grade is "+Grade);
	}

}
