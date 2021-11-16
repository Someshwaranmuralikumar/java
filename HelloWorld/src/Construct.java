class List	//class name is list is an default constructor
{
	int num1,num2,result;
	public List(int number1, int number2)//In this method has a same class name
	{
		num1 = number1;
		num2 = number2;
	}
	public List(int number1)
	{
		num1 = number1;
	}
}
public class Construct
{
	public static void main(String[] args)
	{
		List obj = new List(3);
		System.out.println(obj.num1);
		System.out.println();
		
	}
}