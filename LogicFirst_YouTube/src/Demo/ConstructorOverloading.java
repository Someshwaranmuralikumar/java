package Demo;
class Box
{
	int length;
	int breath;
	int height;
	Box(int l,int b,int h)
	{
		length =l;
		breath =b;
		height = h;
	}
	Box()
	{
		length = -1;
		breath = -1;
		height = -1;
	}
	Box(int l)
	{
		length = breath = height;
	}
	void setDim(int l , int b,int h)
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
public class ConstructorOverloading {

	public static void main(String[] args) {
		//Box b1 = new Box();
		Box blackBox = new Box();
		blackBox .setDim(4, 5, 6);
		System.out.println("The volume of the bloack box is "+blackBox.volume());
		Box b1 = new Box(2,3,4);
		System.out.println("The volume of the black box is "+blackBox.volume());
		Box  b2 = new Box(12);
		System.out.println("b2 height is "+b2.height);
	}

}
