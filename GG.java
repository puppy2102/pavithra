package Guvi;

import java.util.Scanner;

public class GG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		 Scanner sc=new Scanner(System.in);
		 String a[]=sc.nextLine().split(" ");
		 for(i=0;i<a.length;i++)
		 {
			 for(j=a[i].length()-1;j>=0;j--)
			 {
				 if(j==0)
					 System.out.print(a[i].toLowerCase().charAt(j));
				 else if(j==(a[i].length()-1))
						 System.out.print(a[i].toUpperCase().charAt(j));
				 else
					 System.out.print(a[i].charAt(j));
			
			 }
			 System.out.print(" ");
		 }
	}

}
