import java.awt.Color;
import javax.swing.JFrame;
public class GUI_JFrame 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();//Create a frame
		frame.setTitle("Hello world!!!");//Sets the title of the frame
		frame.setVisible(true);//frame to be visible
		frame.setSize(600,600);//Creates an X and Y dimensions of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		frame.setResizable(false);//prevent frame from being resized
		
//		ImageIcon image = new ImageIcon("download.png");
//		frame.setIconImage(image.getImage());//Change icon of the frame
//		frame.getContentPane().setBackground(Color.green);//change the background color 
		frame.getContentPane().setBackground(new Color(67,53,45));//
		
	}

}
