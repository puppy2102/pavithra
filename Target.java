package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
int a=sc.nextInt();
		
		int[]x=new int[a];
		for(int i=0;i<a;i++){
			x[i]=sc.nextInt();
			}
		System.out.println("target");
		int t=sc.nextInt();
		Arrays.sort(x);
		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if (x[i]+x[j]==t){
					System.out.println(x[i]+","+x[j]);
				}
			}
		}

	}

}
