/**
 * 
 */
package Demo;

/**
 * @author somes
 *
 */
public class BitwiseOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a,b;
		a = 9;
		b= 12;
		byte d =4;
		int c = a&b;
		System.out.println("a&b is "+c);
		c = a|b;
		System.out.println("a|b is "+c);
		c = ~a;
		System.out.println("~a is "+c);
		System.out.println("Left Shift");
		c = d<<4;
		System.out.println((byte)c);//promoted to integer
		System.out.println("Right Shift");
		int e = 4;
		c = e>>2;
		System.out.println(e);
		System.out.println("Short Circuit Logial");
		System.out.println((a>1)&&(a<10));
		System.out.println((a<300)||(a>10));
	}

}
