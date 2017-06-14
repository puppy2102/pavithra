package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a=sc.nextInt();
		int[]x=new int[a];
		for(int i=0;i<a;i++){
			x[i]=sc.nextInt();
		}
		System.out.println("check index");
		int b=sc.nextInt();
		for(int j=0;j<a;j++){
			if(x[j]==b){
				int c=j;
			System.out.println("index value is"+c);
		}

	}

}
}
