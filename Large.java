package pups;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c)){
			System.out.println("largest is"+a);
		}
		else if((b>a)&&(b>c)){
			System.out.println("largest is"+b);
		}
		else if((c>a)&&(c>b)){
			System.out.println("largest is"+c);
		}
			}

		
	}


