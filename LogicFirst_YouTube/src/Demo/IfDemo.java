/**
 * 
 */
package Demo;

/**
 * @author somes
 *
 */
public class IfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int a = 45;int b = 10;
//		int max;
//		if(a>b)
//			max = a;
//		else
//			max = b;
		
//		max = (a>b) ? a:b;
//		System.out.println(max);
//	    int a = 2;
//	    int b = 7;
//	    int c= 2;
//	    int extraNumber = (a==b)?c:(a==c)?b:a;
//	    System.out.println(extraNumber);
		
		
		int a , b,c;
		a = 2;
		b=7;
		c = 2;
		if(a==b)
			System.out.println(c);
		else if(b==c)
			System.out.println(a);
		else if(c==a)
			System.out.println(b);
		else
			System.out.println("All the values are not equal");
	    
	    	
	    
	}

}
