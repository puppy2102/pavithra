package Guvi;
import java.util.Scanner;
public class Revno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=0;
		int rev=0;
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
System.out.println(rev);
	}

}
