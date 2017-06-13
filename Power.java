package pups;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int exp=sc.nextInt();
int result=1;
for(int i=1;i<=exp;i++){
	result=result*base;
}
System.out.println("result is"+result);
	}

}
