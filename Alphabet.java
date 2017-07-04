package Beginner;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(((a>=97)&&(a<=122))||((a>=65)&&(a<=90))){
			System.out.println("alpha");
		}
		else {
			System.out.println("number");
	}

	}
}
