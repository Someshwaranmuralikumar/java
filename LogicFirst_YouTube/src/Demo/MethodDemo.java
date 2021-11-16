package Demo;
public class MethodDemo 
{
	public static void main(String[] args) 
	{
//		int valueOfVolume = 
		volume(5,6,7);
		/* System.out.println("The volume size is "+valueOfVolume); */
	}
	static void volume(int length,int breath,int height)
	{
		int vol;
		vol = length*breath*height;
		System.out.println("The volume size is "+vol);
		//return(vol);
	}

}
