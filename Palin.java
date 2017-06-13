package pups;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		int n1=num;
		while(num!=0){
			
			reverse=reverse*10;
					reverse=reverse+num%10;
			num=num/10;
			
		}
		if(n1==reverse){
			System.out.println("it is palindrome");
		}
		else{
			System.out.println("its is not a palindrome");
		}

			}

		}

	

