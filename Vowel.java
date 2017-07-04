package Beginner;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
			System.out.println("vowel");
		}
		else {
			System.out.println("consonent");
		}
	}

}
