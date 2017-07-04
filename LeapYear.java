package Beginner;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if((a%4)==0){
			System.out.println("leap");
		}
		else {
			System.out.println("non leap");
	}

}
}
