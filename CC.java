package Guvi;

import java.util.Scanner;

public class CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
	    int c=0;  
	    int div=sc.nextInt();
	    int divisor=sc.nextInt();  
	    while(div>=0)
	    {
	      div=div-divisor;
	      c ++;
	    }
	    System.out.println(c-1);
	  }
	
	

}
