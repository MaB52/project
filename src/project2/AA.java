package project2;
import java.util.Scanner;
public class AA {
	public static double tax() {
		int salary = 0;
		for (int i=0 ; i<salary ; i++)
		{	
			int t = 15;
			double tax = (salary*t/100);
		}
		return tax();
}
	public static void main(String[] args) {
		Scanner inbut = new Scanner(System.in);
	String Pices[]= {"mouse","keybord","TV"};
	double price[] = {166 , 278 ,800 };
	String str = "";
	for (int i=0 ; i<price.length ; i++)
	{	
		int t = 15;
		double tax = (price[i]*t/100);
		//double tax = (price[0]*t/100);
		System.out.println("  > Enter >M< to see the price for mouse");
		System.out.println("  > Enter >K< to see the price for keybord");
		System.out.println("  > Enter >T< to see the price for TV");
		System.out.print("Enter the pice : ");
		str = inbut.next();
		if (str.equalsIgnoreCase("M"))
		{
			System.out.println("the Price for "+ Pices[0] +" is : " + price[0] +" withe the tax "+ (tax+price[0]) );	
		}
		else if (str.equalsIgnoreCase("k"))
		{
			System.out.println("the Price for "+ Pices[1] +" is : " + price[1] +" withe the tax "+ (tax+price[1]) );
		}
		else if (str.equalsIgnoreCase("t"))
		{
			System.out.println("the Price for "+ Pices[2] +" is : " + price[2] +" withe the tax "+ (tax+price[2]) );
		}
		else
		{
			System.out.println("wrong!!!");
		}
		
	}
	
	
	}

}
