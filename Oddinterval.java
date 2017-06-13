package pups;
import java.util.Scanner;
public class Oddinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<=b;i++){
	if(a%2!=0){
		for(int j=a;j<=b;j=j+2){
			System.out.println(j);
			
		}
	break;
	}
}
	}

}
