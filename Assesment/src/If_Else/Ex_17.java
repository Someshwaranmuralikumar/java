package If_Else;
import java.util.*;
import static java.lang.Math.sqrt;
public class Ex_17
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 17");
		double a,b,c,root1,root2,imaginary,discriminant;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		a = input.nextFloat();
		System.out.print("Enter the Scecond Number : ");
		b = input.nextFloat();
		System.out.print("Enter the Third Number : ");
		c = input.nextFloat();
		
		discriminant = (b*b)-(4*a*c);
		
		if(discriminant >0)
		{
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.print("Two distinct and real roots exists : "+root1+" and "+root2);
			
		}
		else if(discriminant==0)
		{
			root1 = root2  = -b/(2*a);
			System.out.println("Two equal and real roots exists : "+root1+ " and "+root2);
		}
		else if(discriminant<0)
		{
			root1 = root2 = -b/(2*a);
			imaginary = Math.sqrt(-discriminant)/(2*a);
			System.out.println("Two distinct compolex roots exists : "+root1+" and "+root2+" and "+imaginary);
		}
		else
		{
			System.out.println("Retry!!!");
		}
		
	}
}
