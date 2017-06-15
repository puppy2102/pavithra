package Guvi;
import java.util.Scanner;
public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ori=sc.next();;
		String rev="";
		int a=ori.length();
		for(int i=a-1;i>=0;i--){
			rev=rev+ori.charAt(i);
		}
		System.out.println(rev);
	}

}
