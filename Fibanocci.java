package pups;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n1=0;
int n2=1;
int n3;
System.out.print(n1);
System.out.print("\t"+n2);
for(int i=2;i<a;i++){
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print("\t"+n3);
}

	}

}
