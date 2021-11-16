import javax.swing.JOptionPane;

public class UserInput 
{

	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Enter your name ");
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age :"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
		String fname = JOptionPane.showInputDialog("Enter your fathers name : ");
		JOptionPane.showMessageDialog(null, "Your father name is "+fname);
		String Mname = JOptionPane.showInputDialog("Enter your mothers name : ");
		JOptionPane.showMessageDialog(null,"Your mother name is "+ Mname);
	}

}
