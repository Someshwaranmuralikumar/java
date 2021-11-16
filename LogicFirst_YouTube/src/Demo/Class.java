package Demo;


public class Class
{
	public int length;
	public int breath;
	public int height;
	public static void main(String[] args) 
	{
		Class BlackBox = new Class();
		BlackBox.length = 90;
		BlackBox.height = 45;
		Class WoodenBox = new Class();
		WoodenBox.length = 70;
		WoodenBox.breath = 67;
		System.out.println("The blackbox length is " + BlackBox.length);
		System.out.println("The blackbox breath is "+BlackBox.breath);
		System.out.println("The wooden box length is "+WoodenBox.length);
		System.out.println("The wooden box height is "+WoodenBox.height);
	}
}

