package pups;
import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result;
		int a=sc.nextInt();
		for(int i=1;i<=10;i++){
			result=i*a;
			System.out.println(i +"*"+ a +"="+result);
		}

	}

}
