package pups;

import java.util.Scanner;

public class Primeinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
	count=0;
			for( int n=1;n<=i;n++){
				if(i%n==0){
					count++;
				}
			}
				if(count==2){
					System.out.println(i);
					

	}

		}
	}


	}

