package Player;

import java.util.Scanner;

public class ReverseStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ori=sc.next();
		String reverse = new StringBuffer(ori).reverse().toString();
		System.out.println("reverse is "+reverse);
	}

}
