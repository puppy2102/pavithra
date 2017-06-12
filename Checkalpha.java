package handson2;

import java.util.Scanner;

public class Checkalpha {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String c2=sc.next();
		char c1=c2.charAt(0);
		int b=(int)c1;
		if((b>=65&&b<=90)||(b>=97&&b<=122)){
			System.out.println("alpha");
		}
		else if((b>=91&&b<=96)||(b>=122&&b<=127)){
			System.out.println("spl character");
		}
		else
			System.out.println("digit");
	}

}
