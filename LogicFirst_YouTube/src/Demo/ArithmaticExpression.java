package Demo;

public class ArithmaticExpression {

	public static void main(String[] args) {
		int a,b,c;
		a=8;
		b=2;
		c=4;
		if((a+b==c)||(a-b==c)||(a*b==c)||(a/b==c && a%b==0 ))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
