package Pro;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day");
		Scanner sp=new Scanner(System.in);
		String str=sp.next();
	    String str1=str.toLowerCase();
		if(str1.equals("sunday"))
		{
		System.out.print("false");
		}
		else
		{
			System.out.print("true");
		}
		 
		
		}
}
