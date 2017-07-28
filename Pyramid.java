package Hunter;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a;i>0;i--){
			for(int j=0;j<2;j++){
				for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.print(" ");
		}
			System.out.println(" ");
		}
	}

}
