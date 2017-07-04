package Beginner;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>0){
	System.out.println("positive");
}
else if(a<0){
	System.out.println("negative");
}
else if(a==0){
	System.out.println("zero");
}
	}

}
