package If_Else;
import java.util.*;
public class Ex_18 
{
	public static void main(String[] args) 
	{
		System.out.println("EXERCISE - 18");
		int CostPrice,SellingPrice,amount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the orginal Cost price : ");
		CostPrice = input.nextInt();
		System.out.print("Enter your Selling Price : ");
		SellingPrice = input.nextInt();
		if(SellingPrice>CostPrice)
		{
			amount = SellingPrice-CostPrice;
			System.out.println("Your profit amount is  "+amount);
		}
		else if(CostPrice>SellingPrice)
		{
			amount = CostPrice-SellingPrice;
			System.out.println("Your Loss amount is  "+amount);
		}
		else
		{
			System.out.println("You have No Profit and No Loss");
		}
	}

}
