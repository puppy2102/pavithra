package pups;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int leap=sc.nextInt();
if(leap%4==0){
	System.out.println("it is leapyear");
}
else{
	System.out.println("not leap");
}
	}

}
