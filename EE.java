package Guvi;

import java.util.Scanner;

public class EE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here");
			int n=sc.nextInt();
			int in=0,sum=0;
			int remind[]=new int[String.valueOf(n).length()];
			while(n>0) {
				remind[in++]=n%10;
				n/=10;}
			for(int i=0;i<in-1;i++) {
				sum+=Math.pow(remind[i], remind[i+1]);}
			System.out.println(sum+1);

			}

}
