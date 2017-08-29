package Guvi;

import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int l=scan.nextInt(),i;
		int n[]=new int[l];
		for(i=0;i<l;i++)
		{
			n[i]=scan.nextInt();
		}
		for(i=0;i<l-1;i++)
		{
			if(n[i]>n[i+1])
			System.out.println(n[i+1]);
			else
				System.out.println("-1");
			
			
		}
				
				
	
	}

}
