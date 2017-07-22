package Pro;

import java.util.Scanner;

public class Numericc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,p="";
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
		if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='.'||ch[i]=='e'){
		System.out.println("True");
		break;
		}
		else{
			System.out.println("False");
		}
		}
	}
	
	

}
