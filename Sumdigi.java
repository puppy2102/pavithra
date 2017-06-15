package Guvi;
import java.util.Scanner;
public class Sumdigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=0;
		int sum=0;
		int remi=0;
		int rev=0;
		while(a!=0){
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		while(sum!=0){
			remi=sum%10;
			rev=rev*10+remi;
			sum=sum/10;
		}
		if(sum==rev){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}

	}

}
