package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("size");

int b=sc.nextInt();
int[]x=new int[50];
for(int i=0;i<50;i++){
	x[i]=sc.nextInt();
	}
System.out.println("position");
Arrays.sort(x);

		System.out.println(x.length-b);
}

}
