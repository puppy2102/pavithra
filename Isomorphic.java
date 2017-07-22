package Pro;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		if(str.length()==str1.length())
		{
		LinkedHashSet ls=new LinkedHashSet();
		char[] c=str.toCharArray();
		String d="";
		for(char i:c)
		{
		ls.add(i);
		}
		for(char i:c)
		{
		d+=i;
		}
		for(int i=0;i<d.length();i++)
		{
		str=str.replace(d.charAt(i),str1.charAt(i) );	
		}
		if(str.equals(str1))
		{
		System.out.println("True");
		}else
		{
		System.out.println("False");
		}
		}else
		{
		System.out.println("False");
		}
		}
		}
	


