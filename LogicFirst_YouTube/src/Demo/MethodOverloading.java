package Demo;

public class MethodOverloading
{
	public static void main(String[] args)
	{
		System.out.println(max(5,7));
		System.out.println(max(5.5,6.7));
		System.out.println(max('q','l'));
		test();
		test(4);
		test(4,5);
		test(9,6,6);
		System.out.println(Math.abs(4.5));
		System.out.println(Math.abs(-10));
		System.out.println(Math.sqrt(4));
	}
	static void test(int a,int b,int c)
	{
		System.out.println("This method has 3 arguments.");
	}
	static void test(int a,int b)
	{
		System.out.println("TZhis method has 2 arguments.");
	}
	static void test()
	{
		System.out.println("This method has no arguments.");
	}
	static void test(int a)
	{
		System.out.println("This method has arguments.");
	}
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	static double max(double a,double b)
	{
		return a>b?a:b;
	}
	static char max(char a,char b)
	{
		return a>b?a:b;
	}
}
