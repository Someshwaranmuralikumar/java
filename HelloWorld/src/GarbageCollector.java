
class Box
{
	int length;
	int breath;
	int height;
	Box(int l, int b, int h)
	{
		length = l;
		breath = b;
		height = h;
	}
	void setDim(int l,int b,int h)
	{
		length = l;
		breath = b;
		height = h;
	}
	int volume()
	{
		return length*breath*height;
	}
}
public class GarbageCollector
{
	public static void main(String[] args)
	{
		Box BlackBox = new Box(5,6,7);
		BlackBox.setDim(6,4,3);
		System.out.println("Volume of the black box is : "+BlackBox.volume());
		Box woodBox = new Box(30,24,25);
		System.out.println("Volume of the wooden box is "+woodBox.volume());
		woodBox.setDim(56, 45, 23);
		woodBox = BlackBox;
		Box b1 = new Box(4, 5, 4);
	}

}
