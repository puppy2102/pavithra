package pups;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=2;i<number/2;i++){
			if((number%i)!=0){
				System.out.println("It is prime ");}
			else
				System.out.println("It is nt prime");
			}
sc.close();
	}
	}

