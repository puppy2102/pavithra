package Player;

import java.util.Scanner;

public class NumRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c;
		int rev=0;
		while(a!=0){
			c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		System.out.println(rev);
	}

}
