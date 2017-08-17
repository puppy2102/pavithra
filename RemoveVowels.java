package Player;
import java.util.Scanner;
public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=new StringBuffer(s).reverse().toString();
String s3=s1.replaceAll("[aeiouAEIOU]","");
System.out.println(s3);
	}

}
