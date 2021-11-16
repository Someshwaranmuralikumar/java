import java.util.*;
class stringing
{
public static void main(String[] args)
{
String s1= " Welcome to Java ";
String s2 = s1.toUpperCase();
String s3 = s1.toLowerCase();
String s4 = s2.concat(s3);
System.out.println("The length of "+ s1 + " is " + s1.length());
System.out.println("The uppercase is " + s1.toUpperCase());
System.out.println("The lowercase is " + s1.toLowerCase());
System.out.println("The concatenating string is "+s4);
}
}
