package Guvi;

import java.util.Scanner;

public class BB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int po=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("String 1 : ");
		String s1=sc.nextLine();
		System.out.println("String 2 : ");

		String s2=sc.nextLine();
		sc.close();
		if(s1.contains(s2))
		{
			po=s1.indexOf(s2);
		}
		else
			po=-1;
		System.out.println("Output :"+po);
	}

}
	


